package lectures.oo

object Inheritance extends App {

  //can use final to prevent class from being extended
  //sealed will not allow extension from outside Inheritance file
  sealed class Animal {
    val creatureType = "wild"
    //can use final to prevent method from me overridden
    def eat = println("eating")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat
  cat.crunch

  class Person(name: String, age: Int) {
    def this(name: String) = this(name,0) //constructor
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat
      println("crunch crunch")
    }
  }
  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)

  val unknownAnimal: Animal = new Dog("k9")
  unknownAnimal.eat



}
