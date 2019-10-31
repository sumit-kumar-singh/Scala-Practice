// pre-defined string methods

// creating class
class StringMethod {
	var a : String = "Scala string example"
	var b : String = "Hello Scala"
	var c : String = "Hello Scala"

	// equals()
	def equalsMethod() {
		println("Is a and b is same : " + (a.equals(b)))
		println("Is a and c is same : " + (a.equals(c)))
		println("Is b and b is same : " + (b.equals(c)))
	}

	// compareTo()
	/*
		s1 > s2   => positive number    
		s1 < s2   => negative number    
		s1 == s2  => 0    
	*/
	def compareToMethod() {
		println("Is a and b is same : " + (a.compareTo(b)))
		println("Is a and c is same : " + (a.compareTo(c)))
		println("Is b and b is same : " + (b.compareTo(c)))
	}

	// concat()
	// using + operator or you can also use concat() method to concatenate
	def concatMethod() {
		println("Concating " + (a.concat(b)))
		println("Is b and b is same : " + (b.concat(c)))
	}

	// substring()
	def substringMethod() {
		println("Substring is : " + a.substring(0, 5))
	}

}

// creating main and object
object MainObject {
	// main method
	def main(args : Array[String]) {
		var s = new StringMethod()
		s.equalsMethod()
		s.compareToMethod()
		s.concatMethod()
		s.substringMethod()
	}
}