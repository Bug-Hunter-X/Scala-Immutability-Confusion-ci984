```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // prints 15 
  println(obj.x) // prints 5

  val obj2 = new MyClass(10) 
  println(obj2.myMethod(5)) //prints 15
  println(obj2.x) //prints 10
  
  //Adding a comment to further explain the immutability
  //The val keyword ensures that x cannot be reassigned within the class. 
  //This is different from mutable variables (declared with var) which can be modified after initialization.
}
```