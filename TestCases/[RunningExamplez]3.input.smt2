(declare-fun i_loop () (_ BitVec 4))
(declare-fun in_loop () (_ BitVec 4))
(assert (= in_loop (bvshl (bvnot (_ bv0 4)) i_loop)))
(assert (and (bvuge i_loop (_ bv1 4)) (bvule i_loop (_ bv2 4))))

(define-fun getbit ((x (_ BitVec 4)) (index (_ BitVec 4))) (_ BitVec 1)
    ((_ extract 0 0) (bvlshr x index)))
    
(define-fun loopConF ((x (_ BitVec 4))) Bool
    (= (getbit x i_loop) ((_ extract 3 3) x))) ;; k+1 ~ i_loop

(define-fun next ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
    (= ((_ extract 2 0) fap) ((_ extract 3 1) A)))
		
(define-fun yesterday ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
    (= fap (bvshl A (_ bv1 4))))
		
(define-fun zeta ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
    (= fap (bvor (bvshl A (_ bv1 4)) (_ bv1 4))))

(define-fun until ((fap (_ BitVec 4)) (A (_ BitVec 4)) (B (_ BitVec 4))) Bool
	(and
		(= ((_ extract 2 0) fap) (bvor ((_ extract 2 0) B) (bvand ((_ extract 2 0) A) ((_ extract 3 1) fap))))
		(= #b1 (bvor ((_ extract 3 3) A) ((_ extract 3 3) B) (bvnot ((_ extract 3 3) fap))))
		(= #b1 (bvor (bvnot ((_ extract 3 3) B)) ((_ extract 3 3) fap)))
		(or (= #b0 ((_ extract 3 3) fap))
			(= #b1 (bvredor (bvand ((_ extract 2 1) B) ((_ extract 2 1) in_loop)))))))
		
(define-fun release ((fap (_ BitVec 4)) (A (_ BitVec 4)) (B (_ BitVec 4))) Bool
	(until (bvnot fap) (bvnot A) (bvnot B)))

(define-fun since ((fap (_ BitVec 4)) (A (_ BitVec 4)) (B (_ BitVec 4))) Bool
	(and
		(= ((_ extract 0 0) fap) ((_ extract 0 0) B) )
		(= ((_ extract 3 1) fap) (bvor ((_ extract 3 1) B) (bvand ((_ extract 3 1) A) ((_ extract 2 0) fap))))))

(define-fun trigger ((fap (_ BitVec 4)) (A (_ BitVec 4)) (B (_ BitVec 4))) Bool
	(since (bvnot fap) (bvnot A) (bvnot B)))

(define-fun alw ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
	(= fap ((_ repeat 4) (bvredand A))))

(define-fun som ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
	(= fap ((_ repeat 4) (bvredor A))))

(define-fun alwf ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
	(until (bvnot fap) #b1111 (bvnot A)))

(define-fun alwp ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
    (since (bvnot fap) #b1111 (bvnot A)))

(define-fun somp ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
    (since fap #b1111 A))

(define-fun somf ((fap (_ BitVec 4)) (A (_ BitVec 4))) Bool
	(until fap #b1111 A))

(define-fun bviff ((A (_ BitVec 4)) (B (_ BitVec 4))) (_ BitVec 4)
    (bvxnor A B))

(define-fun bvimpl ((A (_ BitVec 4)) (B (_ BitVec 4))) (_ BitVec 4)
    (bvor (bvnot A) B))
(declare-fun a () (_ BitVec 4))
(declare-fun b () (_ BitVec 4))
(declare-fun oltl0 () (_ BitVec 4))
(declare-fun oltl1 () (_ BitVec 4))
(declare-fun oltl2 () (_ BitVec 4))
(assert (and (next oltl0 b)(= oltl1 (bvand a oltl0))(= oltl2 (bvnot oltl1))(= ((_ extract 0 0) oltl2) #b1)
(loopConF a)(loopConF b)(loopConF oltl0)(loopConF oltl1)(loopConF oltl2)))
(assert-soft (= ((_ extract 1 1) b) #b1) :weight 2.6)

(assert-soft (= ((_ extract 0 0) a) #b1) :weight 2.5)
(assert-soft (= ((_ extract 1 1) a) #b1) :weight 2.5)
(assert-soft (= ((_ extract 2 2) a) #b1) :weight 2.5)
(check-sat)
(get-model)
(get-objectives)