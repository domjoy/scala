package learn.concepts._20_abstract_ //the underscore is used to avoid issue with reserved word abstract

abstract class Person20(val name: String) {
  def id: Int
  /* No method body ... above is an abstract method.
   * Try defining something in it. More details in the
   * overrides/inheritence examples.
   */
}

class Employee20(name: String) extends Person20(name) {
  def id = name.hashCode // override keyword not required.
  /* Try hiding this method and see what happens.
   * Abstract methods from superclass must be overriden.
   */
}

object DemoPerson20 extends App {
  //val test = new Person20("Richie Benaud")
  /* QUESTION: What's wrong with the above instantiation?
   * ANSWER: You cannot instantiate an abstract class.
   * You can extend an abstract class, then the new class
   * can be instantiated as seen below.
   */

  val fred = new Employee20("Sanjoy Pinto")
  println(fred.id)
}

import java.awt._
/* unlike java, we can import classes anywhere in the file.
 * Here the underscore is used a s a wild-card similar to
 * asterisk(*) in java. This will import all the classes
 * from package java.awt.
 * Other ways of importing shown below...
 */
import java.awt.{ Color, Font } //ctrl-space works to auto-fill the class/package names if required.