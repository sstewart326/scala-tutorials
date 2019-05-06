package lectures.functional

object HigherOrderedFunctionsAndCurries extends App {

  //higher order function - function takes function as param
  val superFuntion: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null

  //function that applies a function n times over a value x
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n<=0) x
    else nTimes(f, n-1, f(x))

  val plusOne = (x: Int) => x + 1
  println(nTimes(plusOne, 10 , 1)) // 11

  def nTimesBetter(f: Int => Int, n: Int ): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x: Int) => nTimesBetter(f, n-1) (f(x))

  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1)) // 11


  //curried
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3)
  println(add3(10)) //13


  //functions with multiple parameter list
  def curriedFormatter(c: String)(x: Double): String = c.format(x)

  val standardFormat: Double => String = curriedFormatter("%4.2f")
  val preciseFormat: Double => String = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))
}
