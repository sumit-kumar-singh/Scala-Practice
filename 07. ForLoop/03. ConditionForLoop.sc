// scala program to filter list using for loop

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// creating list of integer
		var lst = List(1, 2, 3, 45, 4, 80, 5)
		// for loop with if condition
		for (a <- lst ; if a < 6) {
			println(a)
		}
	}
}