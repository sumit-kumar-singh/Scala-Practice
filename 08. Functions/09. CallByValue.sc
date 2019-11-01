// scala program for call by value function call

/*
when arguments pass through call-by-value function it compute passed-in
expression’s or arguments value once before calling the function.

changes made to formal parameter do not get transmitted back to caller.

*/

// creating class
class CallByValue {
	// defined function 
    def articleCounts(i : Int) {
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
        var s = new CallByValue()
        var total = 0; 
        // function call
        s.articleCounts  
        { 
            total += 1
            total
        } 
    } 
} 