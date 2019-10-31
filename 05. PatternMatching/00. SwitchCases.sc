// scala program for pattern matching

// it works same as switch case in other programming languages
// it matches best case available in the pattern
// basically it is object to object matching and do binding
// it is deconstruction, type test and action

// creating class
class PatternMatching {
	// initialize var
	var a = 1

	// method for matching pattern
	def patternMatching() {
		a match {
			case 1 => println("One")
			case 2 => println("Two")
			case 3 => println("Three")
			case _ => println("No Match")
		}
	}
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new PatternMatching()
		s.patternMatching()
	}
}