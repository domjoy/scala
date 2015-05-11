package learn.scala.concepts._12_packages

package com {
  package edureka1 {
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package scala2 {
      class Employee(initialSalary: Double) {
        private var salary = initialSalary
        def description = "An employee with salary " + salary
        def giveRaise(rate: Double) {
          salary += Utils.percentOf(salary, rate)
          // Ok to access Utils from parent package
        }
      }
    }
  }
}

package com {
  package edureka1 {
    package scala2 {
      class Manager {
        val subordinates = new collection.mutable.ArrayBuffer[Employee]
        def description = "A manager with " + subordinates.length + " subordinates"
      }
    }
  }
}

object DemoPackages2 extends App {
  val fred = new com.edureka1.scala2.Employee(50000)
  fred.giveRaise(10)
  println("fred : " + fred.description)

  val wilma = new com.edureka1.scala2.Manager
  wilma.subordinates += fred
  wilma.subordinates += new com.edureka1.scala2.Employee(50000)
  println("wilma : " + wilma.description)
}
