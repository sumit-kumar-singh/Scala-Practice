// scala program for recursion

// recursion means calling same function inside the function

// creating class
class RecursionFun {
	// defining function for factorial
	def factorial(x:Int) : Int = {
		if(x < 2) {
			return 1
		} else {
			return x * factorial(x-1)
		}
	}

	// defining function for sum of square
	def sumOfSquare(n:Int) : Int = {
		if(n < 2) {
			return 1
		} else {
			return (n*n + sumOfSquare(n-1))
		}
	}
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new RecursionFun()
		println("Factorial of 5 : " + s.factorial(5))
		println("Sum of Square upto 3 : " + s.sumOfSquare(3))
	}
}

