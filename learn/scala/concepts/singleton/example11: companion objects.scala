package learn.scala.concepts.singleton

/* An excellent example to sift through via
 * debugger and understand the flow of control.
 * Should clear concepts of what is called when
 * and why when using companion objects
 */

class Account11 private (val id: Int, initialBalance: Double) {
  println("Cls-start")
  private var balance = initialBalance
  def deposit(amount: Double) { balance += amount }
  def description = "Account " + id + " with balance " + balance
  println("Cls-end")
}

object Account11 { // The companion object
  println("Obj-start")
  def apply(initialBalance: Double) = new Account11(newUniqueNumber(), initialBalance)
  private var lastNumber = 0
  private def newUniqueNumber() = { lastNumber += 1; lastNumber }
  println("Obj-end")
}

/* Notice that parameters cannot be passed to the
 * primary constructor of the class from the
 * companion object.
 */

object DemoAccountApply extends App {
  println("A")
  val acct = Account11(1000.0)
  /* Notice default constructor takes 2 arguments, however
   * the apply method in companion is defined with 1 argument.
   * The two are not related.
   * 
   * QUESTION: Why does above line call the object and
   * not the class?
   * ANSWER: It really is shorthand for Account11.apply(1000.0).
   * See what happens when you hide the apply method definition
   * in the companion object*/

  println("B")
  println(acct.description)
}

/*Now why would we not able to call the class from
 a non-companion? Well, find out by un-hiding
 below code...*/
//object FakeCompanion {
//val acct1 = new Account11(1, 10.0)
//}

/*Oh but surely we can access the class otherwise
 through other objects. Maybe extending App would
 help? Find out...*/
//object FakeCompanion2 extends App {
//  val acct1 = new Account11(1, 10.0)
//}