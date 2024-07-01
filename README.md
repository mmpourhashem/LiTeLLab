The tool entitle LiTeLLab supports OLTL encoding. It initially separates the optimization layer from the temporal layer. Subsequently, the temporal layer, which comprises an LTL formula, is translated into a quantifier-free fixed-size bit-vector logic (QF\_BV) formula, while the optimization layer is translated into Linear Real Arithmetic (LRA). The resulting specification in SMT-LIB 2.0 (SMT2) is then input into Z3, an Optimization Modulo Theories (OMT) solver developed by Microsoft Research. Z3 integrates state-of-the-art optimization algorithms and extends some of these algorithms. The output of Z3, in SMT2 format, is returned to LiTeLLab and presented to the user. The implemented case studies are available in TestCases directory.

--------------------

The jar file can be executed by the command "java -jar litellab Path_to_the_OLTL_script.txt". This runs the OLTL specification written in the file.

Z3 should be installed on the machine and the file runZ3.sh should be modified according to the Z3 installation.

Litellab will prodcues the following files:
	oltl.output.txt: The main output that can be UNSAT or a trace with the total amount of cost in the end.
	z3.input.smt2: The smt2 script prodcued to be solved by Z3.
	z3.output.smt2: The model prodcued by Z3.
