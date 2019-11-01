// scala program for nested function

// nested function is function inside the function

// creating object
object MainObject { 
	// Main method 
    def main(args: Array[String]) {
        println("Min and Max from 15, 20") 
        maxAndMin(15, 20); 
    } 
      
    // Function 
    def maxAndMin(a: Int, b: Int) = { 
       // Nested Function 
       def maxValue() = {  
          if(a > b)  
          { 
          	println("Max is: " + a) 
          } 
          else
          { 
            println("Max is: " + b) 
          } 
       } 
      
       // Nested Function 
       def minValue() = { 
          if (a < b) 
          { 
            println("Min is: " + a) 
          } 
          else
          { 
            println("Min is: " + b) 
          } 
       } 
       maxValue(); 
       minValue(); 
    } 
} 


