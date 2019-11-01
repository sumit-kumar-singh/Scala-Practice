// scala program of function with default parameters

// helps in the scenario when you don't pass value during function calling
// takes default values of parameters

// creating object
object MainObject {
	def main(args: Array[String]) = {
		// calling with two values  
    	var result1 = functionExample(18,2)
    	// calling with one value
    	var result2 = functionExample(18)
    	// calling without any value  
        var result3 = functionExample()  
        println(result1+"\n"+result2+"\n"+result3)  
    }

    // parameters with default values as 0
    def functionExample(a:Int = 0, b:Int = 0):Int = {  
        return a+b  
    }  
}  