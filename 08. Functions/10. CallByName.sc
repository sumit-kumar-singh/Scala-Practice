// scala program for call by name function call

/*
call-by-Name function calls the expression and recompute the passed-in
expression’s value every time it get accessed inside the function. 

*/
// creating class
class CallByName {
	// defined function 
    def articleCounts(i : => Int) {
		println("Total = " + i) 
        println("Total = " + i) 
        println("Total = " + i) 
        println("Total = " + i) 
    }
}
// creating object
object MainObject { 
    // main method 
    def main(args: Array[String]) { 
        var s = new CallByName()
        var total = 0; 
        // function call
        s.articleCounts  
        { 
            total += 1
            total
        } 
    } 
} 