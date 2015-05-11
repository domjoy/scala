package learn.concepts._12_packages

package object people {
  val defaultName = "John Q. Public"
}

package people {
  class Person {
    var name = defaultName // A constant from the package
    private[_12_packages] def description = "A person with name " + name
    //try at different levels of packages and see what you find.
  }
}

object DemoPackages4 extends App {
  val john = new people.Person
  println(john.description)
}