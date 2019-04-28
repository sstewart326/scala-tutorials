package lectures.oo

object Notations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"$name, what the heck!?"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi my name is $name and I like $favoriteMovie"
    def apply(n: Int) = s"$name watched $favoriteMovie $n times"
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "scala"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "inception") // only works with methods with one param

  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)

  val x = -1 //equivalent to 1.unary_-
  println(!mary)

  println(mary isAlive)

  println(mary()) // calls the apply by default with objectname()

  println((mary + "the rockstar")())

  println((+mary).age) //calls unary_+

  println(mary learnsScala)
  println(mary(10))
}
