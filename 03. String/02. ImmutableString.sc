// creating class
class StringExample {
	var s: String = "Scala string example"
	// here a new string object is created after modification
	// old string object is still in the memory without any reference
	// s variable now refers to new string object
	s = "This is " + s
	def show() {
		println(s)
	}
}

// creating main and object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new StringExample()
		s.show()
	}
}