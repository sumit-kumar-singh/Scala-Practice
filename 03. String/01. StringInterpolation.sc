// create object
object MainObject {
	def main(args : Array[String]) {
		val name : String = "Sumit kumar"
		val age : Int = 25

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