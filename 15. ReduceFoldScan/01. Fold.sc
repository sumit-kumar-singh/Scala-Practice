// scala program for fold function

// initial value can be given

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// creating lists
		val ageList = List(1, 2, 3, 4, 5, 10)
		val charList = List("A", "B", "C", "D")

		// fold left
		println("Fold left :")
		println(ageList.foldLeft(100)(_+_))
		println(charList.foldLeft("x")(_+_))

		// reduce right
		println("Fold right :")
		println(ageList.foldRight(100)(_-_))
		println(charList.foldRight("x")(_+_))

	}
}