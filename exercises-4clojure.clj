;;; Put your solutions to the assigned 4Clojure exercises here and commit
;;; back up to your fork on Github.

;;; What you enter is what whatever you'd put in the "Code which fills in the blank"
;;; box in 4Clojure. You're welcome to include other things here (helper definitions,
;;; scratch computations you found helpful, etc.), SO MAKE SURE YOU LABEL YOUR
;;; "ANSWERS" clearly.

;;; I've included a few examples below just to give you a sense of what I'm looking
;;; for.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #162: Logical falsity and true

; What I pasted in the box:

1

; because all the given expressions returned 1, for example:

(= 1 (if [] 1 0))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Problem #15: Double Down

; What I pasted in the box:

#(* 2 %)

; which is an anonymous function that doubles its argument, for example:

(= (#(* 2 %) 11) 22)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Problem 10: Intro to maps

;20 because the key :b has 20 as its value

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Problem 16: Hello World

;#(str "Hello, " % "!") the function needs to combine the hello and ! with the given name.
;The % gets the name from the rest of the code

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 17: Sequences: map

;'(6 7 8) the function adds 5 to each value in the list so it returns 1+5 2+5 3+5 in a list.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 18: Sequences: filter

;'(6 7) the function filters out any value below or equal to 5, returning 6 and 7

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 20: Penultimate Element

;(comp second reverse) It takes the second function and reverses it so it starts from the end.
;Comp is what mashes the two together.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 21: Nth Element

;(fn [coll n] (first (drop n coll))) No idea how this one works I had to look it up.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 23: Reverse a Sequence

;#(reduce conj () %) reduce takes a function and its inputs and repeats the function for all inputs.(no idea why it is called reduce)
;the conj takes each value and puts them back in reverse order in this case.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 25: Find tho odd numbers

;#(filter odd? %) the odd? checks for odd numbers and the filter removes the ones that return false

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 37:

;"ABC" removes everything but capitol letters, returning A, B and C

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 40: Interpose a Seq

;(fn [v coll] (butlast (mapcat #(vector % v) coll))) Mapcat takes the vector and concats while butlast puts a thing behind all but the last

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 43 - Reverse Interleave

;(fn deinterleave [coll n]
  ;(for [i (range n)] (take-nth n (drop i coll))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 44 - Rotate Sequence

;(fn [n coll]
  ;(take (count coll) (drop (mod n (count coll)) (cycle coll)))) 
  ;Cycle creates an infinite sequence and the rest just
  ;shifts the sequence by n.

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 46 - Flipping out

;(fn [f]
  ;(fn [& args] (apply f (reverse args))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;Problem 47 - Contain yourself

;4 the first contains a 4, second has an index at 4, third contains a 4, and fourth does not contain an index at 4

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
