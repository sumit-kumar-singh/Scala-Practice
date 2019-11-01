// scala program for tuple demo

// tuple is a collection of elements in ordered form
// you can use tuple to store any type of data
// you can store similar type or mix type data also
// you can use it to return multiple values from a function

// creating object
object MainObject {  
	// main methods
    def main(args:Array[String]) { 
    	// tuple of integer values  
        var tuple1 = (1,5,8,6,4)        

        // tuple of string values             
        var tuple2 = ("Apple","Banana","Gavava") 

        // tuple of float values    
        var tuple3 = (2.5,8.4,10.50)   

        // tuple of mix type values               
        var tuple4 = (1,2.5,"India")  

        // viewing tuples          
        println("Tuple of integer values : " + tuple1)  
        println("Tuple of string values : " + tuple2)  
        println("Tuple of float values : " + tuple3)  
        println("Tuple of mix type values : " + tuple4)

        // accessing values
        println("Iterating tuple values : ")
        // iterating tuple values using productIterator  
        tuple4.productIterator.foreach(println)
        println("Accessing particular values : ")

        // fetching first value 
        println(tuple3._1)
        // fetching second value
        println(tuple4._3)
    }  
}