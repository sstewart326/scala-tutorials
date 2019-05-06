package lectures.functional

object AnonymousFunctions extends App {

  //anonymous function (LAMBDA)
  val doubler = (x: Int) => x * 2
  //also wrote
  val doubler1: Int => Int = x => x * 2

  //multiple params
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething) // prints function object
  println(justDoSomething()) // prints function return value

  val stringToInt = { (str: String) =>
    str.toInt
  }

  val niceIncrementor: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _ //compiler has to be 100% of types so must be defined
}
