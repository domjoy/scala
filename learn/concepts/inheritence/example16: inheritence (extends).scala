package learn.concepts.inheritence

class Person16 {
  var name = ""
  final def abc_= (str: String) {name+str}
}
/* QUESTION: What happens if we defined the Person16
 * class as final?
 * ANSWER: Try it out!
 * (You cannot extend a final class. This is a way
 * to not allow a class to be extended.)
 * 
 * QUESTION: Following up on that, what happens if
 * variable 'name' is made final?
 * ANSWER: You use val to make the variable final.
 * In which case, extending classes may not use that
 * variable.
 * 
 * QUESTION: what about methods?
 * ANSWER: Same. Extending classes may not use final
 * methods. Try un-hiding the definition in the
 * subclass to see what happens!
 */

class Employee extends Person16 {
  var salary = 0.0
  //def abc_= (str: String) {name+ " - " +str}
  def description = "Employee Name is:- " + name + " and salary is:- " + salary
}

object DemoPerson16 extends App {
  val fred = new Employee
  fred.name = "Vishal Kumar"
  //fred.name_=("Sanjoy Pinto")
  fred.salary = 500000
  println(fred.description)
}