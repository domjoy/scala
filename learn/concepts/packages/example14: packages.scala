package learn.concepts.packages

class Dog

package people {
  class Person2 {
    val dogs = new scala.collection.mutable.ArrayBuffer[Dog]
    def description = "A person with " + dogs.length + " dogs"
  }
}

object DemoPackages3 extends App {
  val fred = new people.Person2
  fred.dogs += new Dog
  fred.dogs += new Dog
  println(fred.description)
}