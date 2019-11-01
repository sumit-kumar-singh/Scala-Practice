// scala program for scan function

// initial value can be given
// it gives map of intermediate result also

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// creating lists
		val ageList = List(1, 2, 3, 4, 5, 10)
		val charList = List("A", "B", "C", "D")

		// scan left
		println("Scan left :")
		println(ageList.scanLeft(100)(_+_))
		println(charList.scanLeft("x")(_+_))

		// reduce right
		println("Scan right :")
		println(ageList.scanRight(100)(_-_))
		println(charList.scanRight("x")(_+_))

	}
}