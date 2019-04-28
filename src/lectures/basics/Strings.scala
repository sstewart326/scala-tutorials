package lectures.basics

object Strings extends App {

  val str = "Hello, I am learning Scala"

  val numberString = "45"
  val aNumber = numberString.toInt
  println('a' +: numberString :+ 'z')
  println(str.reverse)
  println(str.take(2)) // He

  val name = "Shawn"
  val age = 28
  //S-Interpolator
  println(s"Hello, my name is $name and I am $age years old")
  println(s"Hello, my name is $name and I will be turning ${age + 1} years old")

  //F-Interpolator
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  //Raw-Interpolator
  println(raw"This is a \n newline")

  val escaped = "This is a \n newline"
  println(raw"$escaped") //This is a
                         // newline

}
