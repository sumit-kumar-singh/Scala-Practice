// scala program for method overloading demo

// Scala provides method overloading feature which allows us to
// define methods of same name but having different parameters
// or data types.
// it helps to optimize code

// creating class
class Arithmetic {
	// add method with two args
    def add(a : Int, b : Int) {
    	// doing add operation
        var sum = a+b  
        println("Sum is two int number : " + sum)  
    }
    // add method with three args
    def add(a : Int, b : Int, c : Int) {
    	// doing add operation
        var sum = a+b+c  
        println("Sum of three int number : " + sum)  
    }
    // add method with two args of Double type
    def add(a : Double, b : Double){ 
    // doing add operation 
        var sum = a+b  
        println("Sum is two double number : " + sum)
    }  


    // all method have same name add
    // depends on calling with parameters
}  


// creating object
object MainObject { 
	// main method
    def main(args : Array[String]) {  
        var a  = new Arithmetic()
        // calling add fun taking 2 args as int
        a.add(10, 10)
        // calling add fun taking 3 args as int
        a.add(10, 10, 10)
        // calling add fun taking 2 args as int
        a.add(10.0, 10.0) 
    }  
}  

