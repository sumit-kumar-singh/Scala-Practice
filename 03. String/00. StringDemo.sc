// in scala, string is a sequence of characters
// it is index based ds and use linear approach to store data into memory
// string is immutable in scala like java
// you can manipulate string and can apply method to get desire result
// but you can't change original string object

// create class for StringExample
class StringExample {  
    var s = "Scala string example"  
    def show() {  
        println(s)  
    }  
}  

// create main object 
object MainObject {  
    def main(args:Array[String]) {  
        var s = new StringExample()  
        s.show()  
    }  
}  