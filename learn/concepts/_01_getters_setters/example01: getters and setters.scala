//A package definition is necessary to be able to run this from within the Eclipse IDE.
package learn.concepts._01_getters_setters

/* 
 * You can also run:
 * scala -Xnojline < Ex1.scala
 * NOTE: It takes a few seconds for it to start, even
 * though it seemed to have done nothing by giving you
 * the scala prompt back.
 * However, you wont see any execution, but only
 * compilations of various definitions
 */

class Counter1 {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 } // Methods are public by default
  def current() = value // bad practice defining a method without code this way, but you still can.
}

class Counter2 {
  private var value = 0
  def increment() { value += 1 }
  def current = value // No () in definition
}

object example1 extends App {
  /*
 * Below code can also be copy-pasted and run in REPL.
 * Copy-paste the class definitions aboive first, then
 * the contents below for execution
 */
  val myCounter1a = new Counter1
  myCounter1a.increment()
  println(myCounter1a.current)

  val myCounter1b = new Counter1() // () ok
  myCounter1b.current() // () ok
  println(myCounter1b.current)

  val myCounter2 = new Counter2
  myCounter2.current // () not ok

  //This code does not work: Un-hide and find out why.
  //myCounter2.current()

  println(myCounter2.current)
}