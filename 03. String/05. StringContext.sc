// scala program of the StringContext  

/*
StringContext is a class that is utilized in string interpolation,
which permits the end users to insert the variables references without 
any intermediary in the processed String literals.
This class supplies raw, s, and f methods by default as interpolators.
The Linear Supertypes here are Serializable, java.io.Serializable,
Product, Equals, AnyRef, and Any.
*/
  
// creating class
// Creating object 
class StringContext {  
        // assigning values 
        val name = "TowardsDataScience.com"
        val articles = 25
        
        // function for StringContext
        def stringContext() {
        	// applying StringContext with s-method 
       		 val result = StringContext("I have written ",  
             		" articles on ", "").s(articles, name) 
 
        // displays output 
        println(result) 
        }  
    } 

// creating object 
object Main {  
    // main method  
    def main(args: Array[String]) {
       var s = new StringContext()
       // displays output 
       s.stringContext()
    } 
} 