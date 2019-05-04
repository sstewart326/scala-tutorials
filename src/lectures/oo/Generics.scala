package lectures.oo

object Generics extends App {

  class MyList[+A] {

    def add[B >:  A](element: B): MyList[B] = ???
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //list of cat does extend list of animal
  class CovariantList[+A]
  val animalList: CovariantList[Animal] = new CovariantList[Cat]

  class InvariantList[A]
  // can't do
  // val invariantAnimalList: InvariantList[Animal] = new InvariantList[Cat]

  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  // A has to be of type animal
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  //can't do
  //val newVage = new Cage(new Car)

}
