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
(declare-const a (_ BitVec 12))
(declare-const b (_ BitVec 12))
(declare-const end (_ BitVec 12))
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
(declare-const otl25 (_ BitVec 12))
(declare-const otl26 (_ BitVec 12))
(declare-const otl27 (_ BitVec 12))
(declare-const otl28 (_ BitVec 12))
(declare-const otl29 (_ BitVec 12))
(declare-const otl30 (_ BitVec 12))
(declare-const otl31 (_ BitVec 12))
(declare-const otl32 (_ BitVec 12))
(declare-const otl33 (_ BitVec 12))
(declare-const otl34 (_ BitVec 12))
(declare-const otl35 (_ BitVec 12))
(declare-const otl36 (_ BitVec 12))
(declare-const otl37 (_ BitVec 12))
(declare-const otl38 (_ BitVec 12))
(declare-const otl39 (_ BitVec 12))
(declare-const otl40 (_ BitVec 12))
(declare-const otl41 (_ BitVec 12))
(assert (and (= otl0 (bvnot end))(alwp otl1 otl0)(= otl2 (bvand otl0 a))(somf otl3 otl2)(= otl4 (bvand otl0 b))(= otl5 (bvand otl15 otl24 otl32 otl3 otl41))(next otl6 end)(next otl7 otl6)(next otl8 otl7)(next otl9 otl8)(next otl10 otl9)(next otl11 otl10)(next otl12 otl11)(next otl13 otl12)(next otl14 otl13)(next otl15 otl14)(next otl16 otl1)(next otl17 otl16)(next otl18 otl17)(next otl19 otl18)(next otl20 otl19)(next otl21 otl20)(next otl22 otl21)(next otl23 otl22)(next otl24 otl23)(next otl25 a)(next otl26 otl25)(next otl27 otl26)(next otl28 otl27)(next otl29 otl28)(next otl30 otl29)(next otl31 otl30)(next otl32 otl31)(= otl33 (bvand otl0 otl39))(next otl34 otl4)(next otl35 otl34)(next otl36 otl35)(next otl37 otl36)(= otl38(bvimpl a otl37))(= otl39 (bvnot otl38))(somf otl40 otl33)(= otl41 (bvnot otl40))(= ((_ extract 0 0) otl5) #b1)
(loopConF a)(loopConF b)(loopConF end)(loopConF otl0)(loopConF otl1)(loopConF otl2)(loopConF otl3)(loopConF otl4)(loopConF otl5)(loopConF otl6)(loopConF otl7)(loopConF otl8)(loopConF otl9)(loopConF otl10)(loopConF otl11)(loopConF otl12)(loopConF otl13)(loopConF otl14)(loopConF otl15)(loopConF otl16)(loopConF otl17)(loopConF otl18)(loopConF otl19)(loopConF otl20)(loopConF otl21)(loopConF otl22)(loopConF otl23)(loopConF otl24)(loopConF otl25)(loopConF otl26)(loopConF otl27)(loopConF otl28)(loopConF otl29)(loopConF otl30)(loopConF otl31)(loopConF otl32)(loopConF otl33)(loopConF otl34)(loopConF otl35)(loopConF otl36)(loopConF otl37)(loopConF otl38)(loopConF otl39)(loopConF otl40)(loopConF otl41)
))
(check-sat)
(get-model)