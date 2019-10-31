// scala program for odd even using pattern matching

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// var
		val i = 4
		i match {
			case 1 | 3 | 5 | 7 => println("Odd Number")
			case 2 | 4 | 6 | 8 => println("Even Number")
		}
	}
}