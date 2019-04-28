package lectures.oo

object Objects extends App {

  object Person {
    val N_EYES = 2
    def canFly: Boolean = false
    def from(mother: Person, father: Person): Person = new Person("Greg")
  }
  class Person(val name: String = "") {
    // instance level functionality
  }

  println(Person.N_EYES)
  println(Person.canFly)

  val mary = Person
  val john = Person
  println(mary == john) //object is singleton

  val katie = new Person
  val bob = new Person
  println(katie == bob) //two different instances of Person class

  val greg = Person.from(katie, bob)


}
