package learn.concepts._04_fields

class PrivateCounter {
  private var value = 0
  def incr() { value += 1 }
  def current = value
  def isLess(otherVal: PrivateCounter) = value < otherVal.value
}

class ObjectOnlyCounter {
  private[this] var value = 0 //scoping the accessibility of the variable to this class only
  def incr() { value += 1 }
  def current = value

  /*See what the problem is by un-hiding the
   line below*/
  //def isLess(otherVal: ObjectOnlyCounter) = value < otherVal.value
  /*change the definition (scope) of 'value'
   in this class to see what happens when you
   try to provide a method accessing such a
   variable.
   Bonus question: Do you think changing the
   method to a lower access like private or
   protected will allow this? Well, go find
   out! :)*/
}

object DemoPrivateCounter extends App {
  var f1 = new PrivateCounter
  var f2 = new PrivateCounter
  f1.incr
  f1.incr
  f2.incr
  println(f2.current + ", " + f1.current + ", "
      + f2.current + "<" + f1.current + ": " + f2.isLess(f1))
}