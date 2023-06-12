package com.pourhashem.oltl.oltl;

class SMT2Builder {
	private Model model;
	private String smt2Model = "";
	private String script = "";
	private int k;

	public SMT2Builder(String script, int bound) {
		this.script = script;
		k = bound;
		smt2Model = getFixedPart() + model.getSemantics() + getFixedPartEnd();
	}

	private String getFixedPart() {
		String fixedPart = "";
		model = new Model(script, k);
		this.k = Model.getBound();
		boolean realAvgCost = true;
		if (realAvgCost)
			fixedPart += "(declare-fun costHSum () Real)\n"
					+ "(declare-fun costHAvg () Real)\n"
					+ "(declare-fun costLSum () Real)\n";

		fixedPart += "(declare-fun i_loop () (_ BitVec " + (k+2) + "))\n"
				+ "(declare-fun in_loop () (_ BitVec " + (k+2) + "))\n"
				+ "(assert (= in_loop (bvshl (bvnot (_ bv0 " + (k+2) + ")) i_loop)))\n"
				+ "(assert (and (bvuge i_loop (_ bv1 " + (k+2) + ")) (bvule i_loop (_ bv" + k + " " + (k+2) + "))))\n"
				+ "\n"
				+ "(define-fun getbit ((x (_ BitVec " + (k+2) + ")) (index (_ BitVec " + (k+2) + "))) (_ BitVec 1)\n"
				+ "    ((_ extract 0 0) (bvlshr x index)))\n"
				+ "    \n"
				+ "(define-fun loopConF ((x (_ BitVec " + (k+2) + "))) Bool\n"
				+ "    (= (getbit x i_loop) ((_ extract " + (k+1) + " " + (k+1) + ") x))) ;; k+1 ~ i_loop\n"
				+ "\n"
				+ "(define-fun next ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "    (= ((_ extract " + k + " 0) fap) ((_ extract " + (k+1) + " 1) A)))\n"
				+ "		\n"
				+ "(define-fun yesterday ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "    (= fap (bvshl A (_ bv1 " + (k+2) + "))))\n"
				+ "		\n"
				+ "(define-fun zeta ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "    (= fap (bvor (bvshl A (_ bv1 " + (k+2) + ")) (_ bv1 " + (k+2) + "))))\n"
				+ "\n"
				+ "(define-fun until ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + ")) (B (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(and\n"
				+ "		(= ((_ extract " + k + " 0) fap) (bvor ((_ extract " + k + " 0) B) (bvand ((_ extract " + k + " 0) A) ((_ extract " + (k+1) + " 1) fap))))\n"
				+ "		(= #b1 (bvor ((_ extract " + (k+1) + " " + (k+1) + ") A) ((_ extract " + (k+1) + " " + (k+1) + ") B) (bvnot ((_ extract " + (k+1) + " " + (k+1) + ") fap))))\n"
				+ "		(= #b1 (bvor (bvnot ((_ extract " + (k+1) + " " + (k+1) + ") B)) ((_ extract " + (k+1) + " " + (k+1) + ") fap)))\n"
				+ "		(or (= #b0 ((_ extract " + (k+1) + " " + (k+1) + ") fap))\n"
				+ "			(= #b1 (bvredor (bvand ((_ extract " + k + " 1) B) ((_ extract " + k + " 1) in_loop)))))))\n"
				+ "		\n"
				+ "(define-fun release ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + ")) (B (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(until (bvnot fap) (bvnot A) (bvnot B)))\n"
				+ "\n"
				+ "(define-fun since ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + ")) (B (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(and\n"
				+ "		(= ((_ extract 0 0) fap) ((_ extract 0 0) B) )\n"
				+ "		(= ((_ extract " + (k+1) + " 1) fap) (bvor ((_ extract " + (k+1) + " 1) B) (bvand ((_ extract " + (k+1) + " 1) A) ((_ extract " + k + " 0) fap))))))\n"
				+ "\n"
				+ "(define-fun trigger ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + ")) (B (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(since (bvnot fap) (bvnot A) (bvnot B)))\n"
				+ "\n"
				+ "(define-fun alw ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(= fap ((_ repeat " + (k+2) + ") (bvredand A))))\n"
				+ "\n"
				+ "(define-fun som ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(= fap ((_ repeat " + (k+2) + ") (bvredor A))))\n"
				+ "\n"
				+ "(define-fun alwf ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(until (bvnot fap) " + getTrue() + " (bvnot A)))\n"
				+ "\n"
				+ "(define-fun alwp ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "    (since (bvnot fap) " + getTrue() + " (bvnot A)))\n"
				+ "\n"
				+ "(define-fun somp ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "    (since fap " + getTrue() + " A))\n"
				+ "\n"
				+ "(define-fun somf ((fap (_ BitVec " + (k+2) + ")) (A (_ BitVec " + (k+2) + "))) Bool\n"
				+ "	(until fap " + getTrue() + " A))\n"
				+ "\n"
				+ "(define-fun bviff ((A (_ BitVec " + (k+2) + ")) (B (_ BitVec " + (k+2) + "))) (_ BitVec " + (k+2) + ")\n"
				+ "    (bvxnor A B))\n"
				+ "\n"
				+ "(define-fun bvimpl ((A (_ BitVec " + (k+2) + ")) (B (_ BitVec " + (k+2) + "))) (_ BitVec " + (k+2) + ")\n"
				+ "    (bvor (bvnot A) B))";
		return fixedPart;
	}

	public String getDecFun(String varName) {
		return "(declare-fun "+ varName +" () (_ BitVec " + k + "))";
	}
	
	private String getFixedPartEnd() {
		
		return 
//				"\n(set-option :sat.bce true) (set-option :sat.dimacs.core true) (set-option :sat.gc.burst true) (set-option :sat.gc.defrag false) (set-option :sat.phase always_true) (set-option :sat.restart geometric) (set-option :sat.subsumption false)\n" +
//					+ "\n(check-sat-using (then ufbv-rewriter dt2bv simplify solve-eqs (! propagate-values :bv_le_extra true :blast_eq_value true :blast_eq_value true) (repeat bit-blast) (! sat :asymm_branch false  :scc false)))"// The objectives number is for (check-sat) and the second check-sat-using returns another unrelated model.
				"\n(check-sat)\n(get-model)\n(get-objectives)";
	}

	private String getTrue() {
		String sTrue = "#b"; 
		for (int i=0;i<k+2;i++)
			sTrue += "1";

		return sTrue;
	}

	public String getSMT2Model() {
		return smt2Model;
	}
	
	public Model getModel() {
		return model;
	}
}
