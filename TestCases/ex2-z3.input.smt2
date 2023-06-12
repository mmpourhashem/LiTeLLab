(declare-fun costHSum () Real)
(declare-fun costHAvg () Real)
(declare-fun costLSum () Real)
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
(declare-fun w1a () (_ BitVec 4))
(declare-fun w1b () (_ BitVec 4))
(declare-fun oltl0 () (_ BitVec 4))
(declare-fun oltl1 () (_ BitVec 4))
(declare-fun oltl2 () (_ BitVec 4))
(declare-fun oltl3 () (_ BitVec 4))
(declare-fun oltl4 () (_ BitVec 4))
(assert (and (next oltl0 b)(= oltl1 (bvand a oltl0))(= oltl2 (bvnot oltl1))(next oltl3 w1b)(= oltl4 (bvand oltl2 w1a oltl3))
(= costHSum (+ 0 
(ite (= #b1 (bvand ((_ extract 0 0) w1a) ((_ extract 0 0) in_loop) (bvnot ((_ extract 0 0) a)))) 2.5 0.0)
(ite (= #b1 (bvand ((_ extract 1 1) w1b) ((_ extract 1 1) in_loop) (bvnot ((_ extract 1 1) b)))) 2.6 0.0)))

(= costLSum (+ 0 
(ite (= #b1 (bvand ((_ extract 0 0) w1a) (bvnot ((_ extract 0 0) in_loop)) (bvnot ((_ extract 0 0) a)))) 2.5 0.0)
(ite (= #b1 (bvand ((_ extract 1 1) w1b) (bvnot ((_ extract 1 1) in_loop)) (bvnot ((_ extract 1 1) b)))) 2.6 0.0)))
(= ((_ extract 0 0) oltl4) #b1)
(loopConF a)(loopConF b)(loopConF w1a)(loopConF w1b)(loopConF oltl0)(loopConF oltl1)(loopConF oltl2)(loopConF oltl3)(loopConF oltl4)))
(assert (= costHAvg (ite (= i_loop (_ bv1 4)) (/ costHSum 2.0) costHSum)))
(minimize costHAvg)
(minimize costLSum)
(check-sat)
(get-model)
(get-objectives)