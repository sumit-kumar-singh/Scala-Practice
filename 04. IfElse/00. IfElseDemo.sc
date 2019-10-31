// scala program for if else conditional

// scala provides if statement to test the conditional expressions
// tests boolean conditional expression which can be either true or false

class IfElseDemo {
	// variables
	var x : Int = 20
	var res : String = ""
	// method for ifElse expression
	def ifElseExp() {
		if (x == 20) {
			res = "x == 20"
		} else {
			res = "x != 20"
		}
		println(res)
	}

	// method for ifElse statement
	def ifElseStatement() {
		val res = if(x != 20) "x == 20" else "x !=20"
		println(res)
	}

}

object MainObject {
	// main function
	def main(args : Array[String]) {
		var s = new IfElseDemo()
		s.ifElseExp()
		s.ifElseStatement()
	}
}