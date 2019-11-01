// scala program of function with named parameters

// can specify the names of parameters during calling the function
// can pass named parameters in any order and can also pass values only

// creating object
object MainObject {
	def main(args: Array[String]) = {
		// calling with two values
    	var result1 = functionExample(a=18, b=2)
    	// calling with one value
    	var result2 = functionExample(b=18, a=2)
    	// calling without any value
        var result3 = functionExample(20)
        println(result1 + "\n" + result2 + "\n" + result3)
    }

    // parameters with default values as 0
    def functionExample(a:Int = 0, b:Int = 0):Int = {
        return a+b
    }  
}

