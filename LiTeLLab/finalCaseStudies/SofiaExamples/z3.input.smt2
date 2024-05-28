(declare-const costHSum Real)
(declare-const costHAvg Real)
(declare-const costLSum Real)
(declare-const i_loop (_ BitVec 12))
(declare-const in_loop (_ BitVec 12))
(assert (= in_loop (bvshl (bvnot (_ bv0 12)) i_loop)))
(assert (and (bvuge i_loop (_ bv1 12)) (bvule i_loop (_ bv10 12))))

(define-fun getbit ((x (_ BitVec 12)) (index (_ BitVec 12))) (_ BitVec 1)
    ((_ extract 0 0) (bvlshr x index)))
    
(define-fun loopConF ((x (_ BitVec 12))) Bool
    (= (getbit x i_loop) ((_ extract 11 11) x))) ;; k+1 ~ i_loop

(define-fun next ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
    (= ((_ extract 10 0) fap) ((_ extract 11 1) A)))
		
(define-fun yesterday ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
    (= fap (bvshl A (_ bv1 12))))
		
(define-fun zeta ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
    (= fap (bvor (bvshl A (_ bv1 12)) (_ bv1 12))))

(define-fun until ((fap (_ BitVec 12)) (A (_ BitVec 12)) (B (_ BitVec 12))) Bool
	(and
		(= ((_ extract 10 0) fap) (bvor ((_ extract 10 0) B) (bvand ((_ extract 10 0) A) ((_ extract 11 1) fap))))
		(= #b1 (bvor ((_ extract 11 11) A) ((_ extract 11 11) B) (bvnot ((_ extract 11 11) fap))))
		(= #b1 (bvor (bvnot ((_ extract 11 11) B)) ((_ extract 11 11) fap)))
		(or (= #b0 ((_ extract 11 11) fap))
			(= #b1 (bvredor (bvand ((_ extract 10 1) B) ((_ extract 10 1) in_loop)))))))
		
(define-fun release ((fap (_ BitVec 12)) (A (_ BitVec 12)) (B (_ BitVec 12))) Bool
	(until (bvnot fap) (bvnot A) (bvnot B)))

(define-fun since ((fap (_ BitVec 12)) (A (_ BitVec 12)) (B (_ BitVec 12))) Bool
	(and
		(= ((_ extract 0 0) fap) ((_ extract 0 0) B) )
		(= ((_ extract 11 1) fap) (bvor ((_ extract 11 1) B) (bvand ((_ extract 11 1) A) ((_ extract 10 0) fap))))))

(define-fun trigger ((fap (_ BitVec 12)) (A (_ BitVec 12)) (B (_ BitVec 12))) Bool
	(since (bvnot fap) (bvnot A) (bvnot B)))

(define-fun alw ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
	(= fap ((_ repeat 12) (bvredand A))))

(define-fun som ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
	(= fap ((_ repeat 12) (bvredor A))))

(define-fun alwf ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
	(until (bvnot fap) #b111111111111 (bvnot A)))

(define-fun alwp ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
    (since (bvnot fap) #b111111111111 (bvnot A)))

(define-fun somp ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
    (since fap #b111111111111 A))

(define-fun somf ((fap (_ BitVec 12)) (A (_ BitVec 12))) Bool
	(until fap #b111111111111 A))

(define-fun bviff ((A (_ BitVec 12)) (B (_ BitVec 12))) (_ BitVec 12)
    (bvxnor A B))

(define-fun bvimpl ((A (_ BitVec 12)) (B (_ BitVec 12))) (_ BitVec 12)
    (bvor (bvnot A) B))
(declare-const lamp (_ BitVec 12))
(declare-const off (_ BitVec 12))
(declare-const OnToOff (_ BitVec 12))
(declare-const on (_ BitVec 12))
(declare-const otl0 (_ BitVec 12))
(declare-const otl1 (_ BitVec 12))
(declare-const otl2 (_ BitVec 12))
(declare-const otl3 (_ BitVec 12))
(declare-const otl4 (_ BitVec 12))
(declare-const otl5 (_ BitVec 12))
(declare-const otl6 (_ BitVec 12))
(declare-const otl7 (_ BitVec 12))
(declare-const otl8 (_ BitVec 12))
(declare-const otl9 (_ BitVec 12))
(declare-const otl10 (_ BitVec 12))
(declare-const otl11 (_ BitVec 12))
(declare-const otl12 (_ BitVec 12))
(declare-const otl13 (_ BitVec 12))
(declare-const otl14 (_ BitVec 12))
(declare-const otl15 (_ BitVec 12))
(declare-const otl16 (_ BitVec 12))
(declare-const otl17 (_ BitVec 12))
(declare-const otl18 (_ BitVec 12))
(declare-const otl19 (_ BitVec 12))
(declare-const otl20 (_ BitVec 12))
(declare-const otl21 (_ BitVec 12))
(declare-const otl22 (_ BitVec 12))
(declare-const otl23 (_ BitVec 12))
(declare-const otl24 (_ BitVec 12))
(assert (and (= otl0 (bvnot lamp))(= otl1 (bvnot on))(= otl2 (bvnot off))(yesterday otl3 lamp)(= otl4 (bvand otl3 otl0))(= otl5(bviff OnToOff otl4))(alwf otl6 otl5)(somf otl7 OnToOff)(next otl8 otl7)(= otl9 (bvand OnToOff otl8))(somf otl10 otl9)(= otl11 (bvnot OnToOff))(alwf otl12 otl11)(somf otl13 otl12)(= otl14 (bvand on off))(= otl15 (bvnot otl14))(since otl16 otl2 on)(= otl17(bviff lamp otl16))(yesterday otl18 otl0)(= otl19(bvimpl on otl18))(= otl20(bvimpl off otl3))(= otl21 (bvand otl15 otl17 otl19 otl20))(alwf otl22 otl21)(next otl23 otl22)(= otl24 (bvand otl0 otl1 otl2 otl6 otl10 otl13 otl23))(= ((_ extract 0 0) otl24) #b1)
(loopConF lamp)(loopConF off)(loopConF OnToOff)(loopConF on)(loopConF otl0)(loopConF otl1)(loopConF otl2)(loopConF otl3)(loopConF otl4)(loopConF otl5)(loopConF otl6)(loopConF otl7)(loopConF otl8)(loopConF otl9)(loopConF otl10)(loopConF otl11)(loopConF otl12)(loopConF otl13)(loopConF otl14)(loopConF otl15)(loopConF otl16)(loopConF otl17)(loopConF otl18)(loopConF otl19)(loopConF otl20)(loopConF otl21)(loopConF otl22)(loopConF otl23)(loopConF otl24)
))
(check-sat)
(get-model)