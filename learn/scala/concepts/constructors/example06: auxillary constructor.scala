package learn.scala.concepts.constructors

class AuxDuck {
  var size = 0;
  var age = 0;

  /*A1*/
  def this(size: Int) {
    /*See what happens if you hide the below line.*/
    this() // Calls the primary constructor
    this.size = size
    println("A1-done")
  }

  /*A2*/
  def this(size: Int, age: Int) {
    /*See what happens if you hide the below line.*/
    this(size) // calls previous auxiliary constructor
    this.age = age
    println("A2-done")
  }
  println("Class done")
}

object DemoAuxDuck extends App {
  println("Calling Primary")
  var a = new AuxDuck
  println()

  println("Calling A1")
  var a1 = new AuxDuck(5)
  println()

  println("Calling A2")
  var a2 = new AuxDuck(5, 10)
  println()

  println(a.size + "," + a.age)
  println(a1.size, a1.age)
  println(a2.size, a2.age)
  
  /*Bonus question: Why do the println statements above
  print that way? Un-hide the below lines to find out*/
  //println(a.size)
  //println(a.size, a.age)
  //println(a.size, a1.size, a2.size)
  /*Answer: Because that's how println works for more
  than 1 parameter*/
}