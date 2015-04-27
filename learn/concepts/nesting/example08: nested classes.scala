package learn.concepts.nesting

import scala.collection.mutable.ArrayBuffer

class Graph {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join(name: String) =
    {
      val m = new Member(name)
      members += m
      /* What makes the above statement work, even if
       * members is 'val'? vals are immutable, isn't it?
       * 
       * Answer: Because ArrayBuffer allows you to do so.
       * Try changing to Array[Member](1) and see what
       * happens.
       */
      
      m //this is a return statement. not very fancy, huh? :)
    }
}

object DemoGraph extends App {
  val chatter = new Graph
  val mFace = new Graph
  val fred = chatter.join("Fred")
  val Wilma = chatter.join("Wilma")
  fred.contacts += Wilma
  val barney = mFace.join("Barney")

  /* Why does the below line error out?*/
  //fred.contacts+= barney
  /* because fred is an immutable 'val'.*/
}