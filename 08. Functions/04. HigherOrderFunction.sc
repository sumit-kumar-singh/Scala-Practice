// scala program for higher order function

// the functions that operate with another functions
// contains other functions as parameter or returns function as an output
// helps in function composition, lambda function or anonymous function

// creating class
class HigherOrderFunction {
	// defining function as arguments
	def math(x:Double, y:Double, f:(Double, Double) => Double):Double = {
		return f(x, y)
	}

	// defining function of function as arguments
	def combine(x:Int, y:Int, z:Int, f:(Int, Int) => Int) : Int = {
		return f(f(x, y), z)
	}
}

// creating object
object MainObject {
	// main function
	def main(args : Array[String]) {
		var s = new HigherOrderFunction()
		// math function
		println("Add : " + s.math(10, 20, (x, y) => x + y))
		println("Substract : " + s.math(20, 10, (x, y) => x - y))

		// combine function
		println("Add : " + s.combine(10, 20, 30, (x, y) => x + y))
		println("Substract : " + s.combine(40, 10, 10, (x, y) => x - y))

		// using wildcard
		println("Addition " + s.combine(2, 2, 3, _+_))
		println("Multiplication " + s.combine(2, 2, 3, _*_))
		println("Minimum " + s.combine(1, 2, 3, _ min _))
		println("Maximum " + s.combine(1, 2, 3, _ max _))
	}
}

