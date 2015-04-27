package learn.repl.cookbook.singleton

object Cookbook {
  //object Cookbook(val recipes: Map[String, Recipe]) {
  val pbj = new Recipe(
    List("peanut butter", "jelly", "bread"),
    List("put the peanut butter and jelly on the bread"))

  val bbp = new Recipe(
    List("blueberries", "panckaes"),
    List("take some blueberries and put it in a pancake"))
}

/* Note that this is not a class, but a singleton object.
 * If it were accompanied with a class definition, it would
 * have been a companion object. 
 *
 * QUESTION: Can objects or traits have parameters?
 *
 * ANSWER: Well, Try it out!
 * (No)
 * 
 * Note how we can define everything in an object - basically
 * no need to type anything into REPL anymore. Laying the
 * foundation of running samples directly into Spark.
 * 
 * EXERCISE: Try initializing Cookbook in REPL two times and
 * note the difference if you see any.
 */