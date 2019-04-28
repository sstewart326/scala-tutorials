package lectures.oo

object AbstractDataTypes extends App {

  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {

    override val creatureType: String = "k9"
    override def eat: Unit = println("crunch crunch")
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
    def preferredMeal: String = "meat"
  }

  trait ColdBlooded {

  }

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"

    override def eat: Unit = println("nom nom")

    override def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating a ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //abstract classes and traits can have abstract and non abstract
  //traits do not have constructor parameters
  //classes can inherit multiple traits
  // traits = behaivor.. what a class does

}
