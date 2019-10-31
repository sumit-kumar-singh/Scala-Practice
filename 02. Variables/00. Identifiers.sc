// identifiers are used for identification purpose.
// in Scala, an identifier can be a class, method, variable or object name

// demo
class GFG {
    var a: Int = 20
}

object Main {
    def main(args: Array[String]) {
        var ob = new GFG();
    }
}

/* 
In the above program we have 6 idtentifiers:

GFG: Class name
a: Variable name
Main: Object name
main: Method name
args: Variable name
ob: Object name

class, object, def, Array, String and var these are Keywords

*/

/*
There are certain rules for defining a valid Scala identifier.
These rules must be followed, otherwise we get a compile-time error.

1. Scala identifiers are case-sensitive.
2. Scala does not allows you to use keyword as an identifier.
3. Reserved Words can’t be used as an identifier like $ etc.
4. There is no limit on the length of the identifier.
5. Identifiers should not start with digits([0-9]).

*/