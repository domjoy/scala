package learn.scala.concepts.getters_setters

class Duck {
  var size = 1
  val diameter = 5
  //getter and setter not defined, but available by
  //default as has been used below
}

object example2 extends App {
  var f = new Duck
  f.size = 10 // first way of calling setter: <object>.<variable> = <param-value>
  f.size_=(10) // second way of calling setter: <object>.<variable>_=(<param-value>)

  //This code does not work: Un-hide and find out why.
  //f.size_ = 10
  //syntax is incorrect. setter with an underscore prefix needs param value to be provided in parentheses.

  println(f.size) // way of calling getter: <object>.<variable>

  //What's wrong with the below setter?
  //f.diameter_=(10)
  //scala doesn't create the default setters for 'val' instance variables.

  println(f.diameter)
}