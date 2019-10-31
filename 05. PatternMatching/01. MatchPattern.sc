// scala program for matching PatternMatching

// creating class
class PatternMatching {
	// define method for matching
	def search(a : Any) : Any = a match {
		case 1 => println("One")
		case "Two" => println("Two") 
		case "Hello" => println("Hello") 
		case _ => println("No Match") 
	}
}

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new PatternMatching()
		s.search("Hello")
	}
}