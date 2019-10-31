// string comparison
// creating class
class StringComparison {
	var a : String = "Scala string example"
	var b : String = "Hello Scala"
	var c : String = "Hello Scala"

	def show() {
		println("Is a and b is same : " + (a == b))
		println("Is a and c is same : " + (a == c))
		println("Is b and b is same : " + (b == c))
	}
}

// creating main and object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new StringComparison()
		s.show()
	}
}