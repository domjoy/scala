package learn.scala.repl.cookbook.better

class Recipe(val ingredients: List[String] = List.empty, directions: List[String] = List.empty) {
  //var ingredients: List[String] = List.empty
  //var directions: List[String] = List.empty

  /* the creation of an object of this class will also
   * immediately display its values!
   */
  println("Ingredients: " + ingredients)
  println("Directions: " + directions)
  def this() = this(List.empty, List.empty)
}

/* QUESTION: What happens when you use same name variables
 * in the body of a class as is the param val name?
 * ANSWER: Well, try it out!
 * (vals with same name cannot be defined twice in same class)
 * 
 * QUESTION: What's the advantage of defining params as vals?
 * ANSWER: they become available via REPL. For the above example,
 * in REPL you could do:
 * scala> val recipe1 = new Recipe1(List("peanut butter,jelly,bread"), List("take peanut butter and jelly and put it on the bread"))
 * scala> recipe1.ingredients
 * 
 * Note the advantage of putting defaults in the param declaration.
 * Now it will also state the values as empty when we create an
 * object of this class. Also, we can call a named parameter to set
 * only that value if required, since default for the other exists.
 * 
 * We have achieved so much with so little code!
 */