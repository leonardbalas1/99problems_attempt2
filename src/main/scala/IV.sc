{
  val s = List(1, 2, 3, 4, 5)
  val t = s.zipWithIndex.map(_._2).max
  val z = t + 1
  println(z)
}
{
  def lenghtfoldLeft(ns: List[Int]): Int = ns.foldLeft(0) { (c, _) => c + 1 }
  lenghtfoldLeft(List(2, 2, 3))
}
{
  List(1, 2, 3, 5, 8).length
}
{
  val s = Seq("apple", "oranges", "apple", "banana", "apple", "oranges", "oranges")
  s.size
}
{
  def len(ns: List[Int]): Int = {
    if (ns == Nil) 0
    else len(ns.tail) + 1
  }
  len(List(1, 2, 3))
}
{
  def len1(ns: List[Int]): Int = {
    ns match {
      case Nil => 0
      case _ => len1(ns.tail) + 1
    }
  }

  len1(List(1, 2, 3))
}

