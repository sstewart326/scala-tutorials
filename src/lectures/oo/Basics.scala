package lectures.oo

object Basics extends App {

  val person = new Person("John", 26)
  println(person.age) //first 4 is printed when object is created
  person.greet("Daniel")
  person.greet

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print
}

class Person(name: String, val age: Int) {
  val x = 2

  println(x + x)

  def greet(name: String): Unit = println(s"${this.name} says Hi, $name") // need to define this
  def greet: Unit = println(s"Hi I am $name") //no need to provide this


  //multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

class Writer(firstName: String, surname: String, val year: Int) {
  def fullname: String = firstName + " " + surname
}

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel =  new Novel(name, newYear, author)
}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1) //immutability
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n<=0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n<=0) this
    else dec.dec(n-1)
  }

  def print = println(count)

}
