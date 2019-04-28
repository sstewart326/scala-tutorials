package lectures.basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello", 3))

  def aParameterlessFunction: Int = 42
  println(aParameterlessFunction)

  // when need loops, use recursion
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello", 3))

  def aFuntionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFuntion(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
  println(aBigFuntion(2))

  def greeting(name: String, age: Int) = "Hi my name is " + name + " and I am " + age
  println("Shawn", 28)

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n-1)
  println(factorial(5))

  def fib(n: Int): Int =
    if (n <= 2) 1
    else fib(n-1) + fib(n-2)
  println(fib(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(2003)) //false
  println(isPrime(37*17)) //true

}
