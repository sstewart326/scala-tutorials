package lectures.oo

object CaseClasses extends App {


  case class Person(name: String, age: Int)

  val jim = new Person("Jim", 34)
  println(jim.name)

  val jim2 = new Person("Jim", 34)
  println(jim == jim2) // case adds hash code and equals

  val jim3 = jim.copy(age = 45)
  println(jim3) // copies name, defines new age

  val thePerson = Person
  val mary = thePerson.apply("Mary", 23) //only use apply when instantiating case classes. apply does same thing as constructor
  println(mary)

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }
}
