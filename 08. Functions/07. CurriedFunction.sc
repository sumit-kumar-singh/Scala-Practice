// scala program for currying functions

// a technique or a process of transforming a function
/*
transforming the function that takes two arguments into a function that
takes one argument and the function itself returns the result.
*/
// syntax - def function name(argument1) = (argument2) => operation

// creating class
class CurryingFunction {
	// defining normal function
	def add1(a:Int, b:Int) = a + b

	// defining currying function
	def add2(a:Int) = (b:Int) => a + b

	// other way of defining currying function
	def add3(a:Int) (b:Int) = a + b
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new CurryingFunction()
		// calling add1
		println("Normal Function : " + (s.add1(20, 30)))

		// calling add2
		println("Currying Function 1 : " + (s.add2(20)(30)))

		// calling add3
		println("Currying Function 2 : " + (s.add3(20)(30)))

		// partial way 1
		var sum20 = s.add2(20)
		println("Partial Way 1 : " + sum20(30))
		
		// partial way 2
		var sum30 = s.add3(30)_
		println("Partial Way 2 : " + sum30(20))
	}
}