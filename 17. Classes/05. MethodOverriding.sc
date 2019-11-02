// scala program for method overriding demo

/*

When a subclass has the same name method as defined in the parent class,
it is known as method overriding. When subclass wants to provide a
specific implementation for the method defined in the parent class,
it overrides method from parent class.

In scala, you must use either override keyword or override
annotation to override methods/fields from parent class.

In scala, you can override fields also.
In scala, you can override only those variables which are declared
by using val keyword in both classes. 

*/

// creating parent class Bank
class Bank {
	// function in parent class 
    def getRateOfInterest() = {  
    	0  
    }    
}    

// creating child class SBI
class SBI extends Bank {    
    override def getRateOfInterest() = {  
    	8  
    }    
}    
        
// creating child class ICICI
class ICICI extends Bank {    
    override def getRateOfInterest() = {  
    	7
    }    
}     

// creating child class AXIS
class AXIS extends Bank {    
    override def getRateOfInterest() = {  
    	9  
    }    
}   

// creating singleton object     
object MainObject {    
	// main method
    def main(args : Array[String]) {
    // instantiation 
    var s=new SBI();    
    var i=new ICICI();    
    var a=new AXIS(); 
    // calling functions  
    println("SBI Rate of Interest: " + s.getRateOfInterest() + "%")    
    println("ICICI Rate of Interest: "+ i.getRateOfInterest() + "%")    
    println("AXIS Rate of Interest: " + a.getRateOfInterest() + "%")    
    }    
}    