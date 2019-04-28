package lectures.basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4) // 14

  println(1 == x) // false

  var aVar = 2
  aVar += 3 // side effect
  println(aVar) // 5

  // Instructions (DO) vs Expressions (VALUE)

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue) // 5
  println(if(aCondition) 5 else 3) // 5

  //NEVER WRITE THE BELOW. LOOPS ARE FROWNED UPON
  var i = 0
  while (i<10) {
    println(i)
    i += 1
  }

  //Everything in Scala is an Expression
  val aWeirdValue = (aVar = 3) // Unit === void
  println(aWeirdValue)

  // side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock) // hello

  val someValue = {
    2 < 3
  }
  println(someValue) // true

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue) // 42
}
