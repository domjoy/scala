package learn.scala.concepts.constructors

class PrimDuck(val size: Int, val age: Int) {
  println("Inside duck constructor")
  def desc = "Duck of age " + age + " is of size " + size
}

object DemoPrimDuck extends App {
  var d1 = new PrimDuck(10, 5)
  println(d1.desc)
}

/*  How come we didn't have a primary constructor call from this
 *  auxiliary constructor?
 *  
 *  Answer: Wrong question. Above is not an auxiliary
 *  constructor, its just a Class that accepts parameters.
 *  Auxiliary constructors are always defined
 *  by 'this(<params>)'
 *  
 *  Primary constructors need not be defined. Notice the
 *  above class has parameters? This is basically implying
 *  that the primary constructor will have those parameters.
 *  Notice the call to the primary constructor from the object.
 *  A primary constructor's params are defined right after the
 *  class name. Moreover, the primary constructor runs through
 *  the definition of the class once called.
 */