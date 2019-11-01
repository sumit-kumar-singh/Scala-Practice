class Curry 
{ 
    // transforming the function that  
    // takes two(multiple) arguments into  
    // a function that takes one(single) argument. 
    def add2(a: Int) = (b: Int) => a + b; 
  
    
} 

object MainObj {
	def main(args: Array[String]) 
    { 
    	var s = new Curry()
        println(s.add2(20)(19))
    } 
}