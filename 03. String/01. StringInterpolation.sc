// create class
class StringInterpolation {
	val name : String = "Sumit kumar"
	val age : Int = 25

	def show() {
		// using println
		println(name + " is " + age + " years old.")
		// using string
		println(s"$name is $age years old.")
		// using format string
		println(f"$name%s is $age%d years old.")

		println(s"Hello \nWorld")
		println(raw"Hello \nWorld")
	}
}

// create object
object MainObject {
	def main(args : Array[String]) {
		var s = new StringInterpolation()
		s.show()
	}
}

/*
It refers to substitution of defined variables or expressions in a 
given String with respected values.
String Interpolation provides an easy way to process String literals.

To apply this feature of Scala, we must follow few rules:

1. String must be defined with starting character as s / f /raw.
2. Variables in the String must have ‘$’ as prefix.
3. Expressions must be enclosed within curly braces ({, }) and ‘$’ 
   is added as prefix.

*/