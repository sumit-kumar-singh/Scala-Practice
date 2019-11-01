// scala program for reduce function

/* 
1. Reduce function is applied on collection data structure in scala
that contains lists, sets, maps, sequence and tuples.

2. Parameter in the reduce function is a binary operation which merges
all the elements from the collection and returns a single value.

3. The first two values is combined with the binary operation and the
resultant of that operation combines with the next value of the collection
and atlast we obtain a single value.

4. No initial value can be given as fold or scan

*/

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// creating lists
		val ageList = List(1, 2, 3, 4, 5, 10)
		val charList = List("A", "B", "C", "D")

		// reduce left
		println("Reduce left :")
		println(ageList.reduceLeft(_+_))
		println(charList.reduceLeft(_+_))

		// reduce right
		println("Reduce right :")
		println(ageList.reduceRight(_-_))
		println(charList.reduceRight(_+_))

	}
}