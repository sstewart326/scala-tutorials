package exercises

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(n: Int): MyList
  def printElement: String
  override def toString: String = printElement

}

object Empty extends MyList {

  override def head: Int = throw new NoSuchElementException

  override def tail: MyList = throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(n: Int): MyList = new Cons(n, Empty)

  override def printElement: String = ""

}

class Cons(h: Int, t: MyList) extends MyList {
  override def head: Int = h

  override def tail: MyList = t

  override def isEmpty: Boolean = false

  override def add(n: Int): MyList = new Cons(n, this)

  override def printElement: String =
    if (t.isEmpty) "" + h
    else h + " " + t.printElement
}

object ListTest extends App {
  val list = new Cons(1, Empty)
  println(list.head)

  val list2 = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list2.head)
  println(list2.tail.head)
  println(list2.add(5).head)
  println(list2.toString)

}
