package learn.scala.repl.cookbook.singleton

class Recipe(val ingredients: List[String] = List.empty,
             val directions: List[String] = List.empty) {
  println("Ingredients: " + ingredients)
  println("Directions: " + directions)
  def this() = this(List.empty, List.empty)
}

/* EXERCISE: Try to see the impact of not defining directions as a val.
 * Note whether you'll be able to access it from Cookbook Singleton object.
 * Similar to private access concept in Java.
 */
