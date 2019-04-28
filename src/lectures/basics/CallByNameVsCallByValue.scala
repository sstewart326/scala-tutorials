package lectures.basics

object CallByNameVsCallByValue extends App {

  //x already has value
  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  //
  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)
  //infinite is never evaluated. lazy loaded because it's pass by name
  printFirst(34, infinite())
}
