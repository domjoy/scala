package learn.scala.repl.cookbook.better

class Cookbook(val recipes: Map[String, Recipe]) {
  println("Recipes: " + recipes)
  def this() = this(Map.empty)
}

/*  turns out that it's the rule that every auxiliary constructor
 *  has to call the primary constructor either directly or indirectly
 *  via another auxi constructor.
 *  
 *  Imagine the usefulness of this approach when you have multiple
 *  overloaded constructors!
 */