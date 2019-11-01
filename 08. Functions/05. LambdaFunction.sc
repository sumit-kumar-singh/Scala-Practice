// scala program for lambda function

// lambda function are short hand function as expression

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// lambda function for square
		var square = (x:Int) => x*x

		// lambda function for sum
		var sum = (x:Double, y:Double) => x+y

		// using function
		println("Square using lambda fun : " + square(5))
		println("Sum using lambda fun : " + sum(5, 10))
	}
}