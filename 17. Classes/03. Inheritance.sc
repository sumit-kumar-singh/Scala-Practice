// scala program for inheritance

// inheritance is an oops concept which is used to reusability of code
// you can achieve inheritance by using extends keyword
// to achieve inheritance a class must extend to other class
// a class which is extended called super or parent class
// a class which extends class is called derived or base class
// syntax - class SubClassName extends SuperClassName(){ }
// types - single, multilevel, hierarchical, multiple and hybrid

// Final is a keyword, which is used to prevent inheritance of super class
// members into derived class. You can declare final variables, methods
// and classes also.

// creating Employee class
class Employee { 
	// defining var 
    var salary : Float = 10000  
}  

// creating Programmer class which extends class Employee
class Programmer extends Employee {
	// defining var
    var bonus : Float = 5000

    // accessing class of parent
    println("Salary from parent class : " + salary)  
    println("Bonus from chil	d class : " + bonus)  
}  

// creating object
object MainObject {  
	// main method
    def main(args:Array[String]) {  
        new Programmer()  
    }  
}  




