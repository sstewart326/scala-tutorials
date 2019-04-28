package lectures.basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n + " - I first need factorial of " + (n-1))
      result
    }
  println(factorial(10))


  def anotherFactorial(n: Int): BigInt = {
    @tailrec // compiler gives error if not tail rec
    def factHelper(x: BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursion call as last expression

    factHelper(n, 1)
  }
  println(anotherFactorial(5000))

  def concatTailrec(aString: String, n:Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatTailrec(aString, n-1, aString + accumulator)
  println(concatTailrec("hello", 3, ""))

  def isPrime(n: Int): Boolean = {
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) return false
      else if (t <= 1) true
      else isPrimeTailRec(t-1, n%t!=0)
    isPrimeTailRec(n/2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

  def fib(n: Int): Int = {
    def fibTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibTailRec(i+1, last+nextToLast, last)
    fibTailRec(2, 1, 1)
  }
  println(fib(8))
}
