// scala program for list demo

// list is a collection which contains immutable data
// list represents linked list in Scala
// lists are immutable whereas arrays are mutable in Scala
// lists represents a linked list whereas arrays are flat
// each element must be of the same type
// lists uses mutable state internally during construction
// list is defined under scala.collection.immutable package

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// creating int list
		var ageList : List[Int] = List(20, 23, 27, 29)

		// creating string list
		var nameList : List[String] = List("Mark", "Jhon", "Smith")

		// accessing lists
		println("Age list is : ")
		println(ageList)

		println("Name list is : ")
		println(nameList)

		// appending items to list using cons
		println("Appending 0 as head of list : ")
		println(0 :: ageList)
		println("Original list didn't changed :")
		println(ageList)

		// creating empty list
		println("Empty List : ")
		println(Nil)
		val emptylist: List[Nothing] = List() 
        println("The empty list : ") 
        println(emptylist) 

		// appending to nil list
		println("Appended Nil list : ")
		println(1 :: 2 :: 3 :: Nil)

		// accessing individual items
		println("First item of ageList : " + ageList(0))
		println("Third item of nameList : " + nameList(2))

		// head method of list
		println("Head of ageList : " + ageList.head)
		println("Head of nameList : " + nameList.head)

		// tail method of list
		println("Tail of ageList : " + ageList.tail)
		println("Tail of nameList : " + nameList.tail)

		// isEmpty method of list
		println("Is ageList Empty? : " + ageList.isEmpty)		
		println("Is nameList Empty? : " + nameList.isEmpty)

		// reverse method of list
		println("Reverse of ageList : " + ageList.reverse)
		println("Reverse of nameList : " + nameList.reverse)

		// max for list
		println("Max from ageList : " + ageList.max)

		// creating uniform list using fill(#element)(value)
		println("Uniform list : ")
		println(List.fill(5)(2))

		// iterating through list using foreach loop
		println("Iterating through ageList using foreach : ")
		ageList.foreach ( println )
		println("Iterating through nameList using foreach : ")
		nameList.foreach ( println )

		// iterating through list using foreach loop
		println("Iterating through ageList using for : ")
		for(age <- ageList) {
			println(age)
		}
		println("Iterating through nameList using for : ")
		for(name <- nameList) {
			println(name)
		}

		// sum of items in ageList
		var sum : Int = 0
		ageList.foreach (sum +=_)
		println("Sum of ageList items : " + sum)

	}
}