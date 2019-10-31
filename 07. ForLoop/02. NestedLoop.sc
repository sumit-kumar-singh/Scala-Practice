// scala program for nested for loop

// used when prior knowlwdge of iteration's number

// creating object
object MainObject {
	// main method
	def main(args: Array[String]) {
		// initialization 
        var a = 0;
        // until for loop
        for (a <- 1 until 5 ; b <- 5 to 10) {
            println(a + " " + b)
        }
   }  
}  