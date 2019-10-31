// as var is defined, it is allocated to memory and value is assigned
// in other words initialization and memory allocation are done
// by using lazy keyword, we can lazily initialize a variable
// its memory allocation and initialization is done when it is used

/*
The difference between them is, that a val is executed when it is defined 
whereas a lazy val is executed when it is accessed the first time.
*/

// lazy var
lazy val x: Int = 40
println("Class of lazy : " + x.getClass)
println("Using x : " + x * 5)
