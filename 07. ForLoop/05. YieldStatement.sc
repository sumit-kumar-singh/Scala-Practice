// scala program for yield statement

// yield keyword will returns a result after completing of loop iterations
// for loop used buffer internally to store iterated result and when
// finishing all iterations it yields the ultimate result from that buffer
// type of the collection that is returned is same type that we tend to
// were iterating over, a Map yields a Map, a List yields a List, and so on
// syntax - var result = for{ var x <- List} yield x

// creating object
object MainObject {
	// main method
	def main(args : Array[String]) {
		// defining array
		var lst = Array(1, 2, 3, 4, 5, 6)
		// for loop
		var buffer = for{i <- lst ; if (i % 2 == 0)} yield i
		// display
		for(i <- buffer) {
			// printing result as even number
			println(i)
		}
	}
}
