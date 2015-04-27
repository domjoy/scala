package learn.scala.concepts.getters_setters

class PrivateDuck {
  private var privateAge = 0
  def age = privateAge //getter definition
  def age_=(newAge: Int) { if (newAge > privateAge) privateAge = newAge; } //setter definition - pay attention to the unique style
  /* Try inserting a space after the underscore above
   * and see what happens!
   */
}

object PrivDuckDemo extends App {
  var f = new PrivateDuck
  //f.size= 10
  f.age_=(-10)

  /*private vars need explicit public getters.
  Flip the comments on below two lines to
  learn what happens*/
  println(f.age) // It calls f.size()
  //println(f.privateAge)
  /* BONUS Question: What if it was a singleton/companion object?
   * Would it allow the private getter/setter?
   * ANSWER: Yes. Try it out!
   */

}

/* Note that since variable privateAge is private, its default getter/setter
 * is also private and cannot be accessed by anyone else but the PrivateDuck
 * class or its companion object. To enable public access to this variable,
 * public age and age_ getter and setter have been defined.
 */
