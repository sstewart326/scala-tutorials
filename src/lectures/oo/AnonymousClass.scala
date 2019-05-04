package lectures.oo

object AnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("hahahahaha")
  }

  println(funnyAnimal.eat)
}
