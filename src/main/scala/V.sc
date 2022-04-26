{
  def reverse1[A](ls: List[A]): List[A] = {
    ls match {
      case Nil => Nil
      case h :: tail => reverse1(tail) ::: List(h)

    }
  }
  reverse1(List(1, 2, 3, 4, 5))
}
{
  def reverse2[A](ls: List[A]): List[A] = {
    ls.foldLeft(List[A]())((x, s) => s :: x)
  }
  reverse2(List(1, 2, 3, 4, 5))
}
import scala.collection.immutable.List
{
  def main(args: Array[String]) // Main method of program
  {
    val mylist: List[String] = List("Online", "Tutorials", "and", "free", "Training", "Materials", "on", "Stechies")
    // Creating and initializing Scala List
    for (element <- mylist.reverse) {
      println(element)
      // output
    }
  }
}
