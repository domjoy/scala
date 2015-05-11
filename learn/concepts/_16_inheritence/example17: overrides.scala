package learn.concepts._16_inheritence

/* toString is a very commonly overriden method/variable. If
 * redefined in any class, it needs to have the override
 * modifier. Try removing it from one of the toString
 * definitions below.
 * 
 * Advantages of override modifier:
 * 1) Ensures you always override the existing method/variable
 * from the superclass if you use the same name method.
 * 2) Ensures no spelling mistakes on the method signature
 * being overridden - method name as well as params.
 */

class Person17 {
  var name = ""
  override def toString = getClass.getName + "=> [name=" + name + "]"
}

class Employee17 extends Person17 {
  var salary = 0.0
  override def toString = super.toString + "=> [salary=" + salary + "]"
}

object DemoPerson17 extends App {
  val vishal = new Employee17
  vishal.name = "Vishal "
  vishal.salary = 500000
  println(vishal) // calls the default toString method,
  //which however is overwritten twice, so Employee17's
  //method is called. 
}