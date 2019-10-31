// scala program for to for loop

// used when prior knowledge of iteration's number
/*
  <- operator is known as a generator, according to the name this operator 
  is used to generate individual values from the range, and the range is 
  the value which holds starting and ending values.
*/

// to use to when we want to print the values from 0 to n

// creating object
object MainObject {
	// main method
	def main(args: Array[String]) {
		// initialization 
        var a = 0;
        // to for loop
        // --> var generator range <--
        for (a <- 1 to 10) {
            println(a)
        }
   }  
}  