package learn.scala.concepts.singleton

class CompAccount {
  val id = CompAccount.newNum()
  private var bal = 0.0
  // var test = lastNum
}

/* Companion object of a class is accessible in the
 * class by itself. But it’s members (variables and
 * methods) are not in scope in the class. See above
 * you can access the companion object. However,
 * newNum() is only available off it, not directly
 * in scope to be used by the class.
 * 
 * Try un-hiding the line above to see what
 * happens when you try to use a variable directly
 * from the companion object within the class.
 */

object CompAccount {
  private var lastNum = 0;
  private def newNum() = { lastNum += 1; lastNum }
}

object DemoCompAccount extends App {
  val r1 = new CompAccount
  println("id1: " + r1.id)

  val r2 = new CompAccount
  println("id2: " + r2.id)
}