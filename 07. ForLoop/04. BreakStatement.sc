// scala program for break statement 

// use a break statement to break the execution of the loop in the program
// instead of break statement, it provides a break method
// which is used to break the execution of a program or a loop
// break method is used by importing scala.util.control.breaks._ package

// Importing break package 
import scala.util.control.Breaks._

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// breakable is used to prevent exception
		breakable {
			// for loop
			for (a <- (1 to 10)) {
				// condition
				if (a == 6) {
					break
				} else {
					println(a)
				}
			}
		}
	}
}