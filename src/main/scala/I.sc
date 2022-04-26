{
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  lastRecursive(List(1, 2, 3))
}
{
  def last1(ns: Seq[Int]): Option[Int]={
    if (ns.isEmpty) None
    else if (ns.size==1) ns.headOption
    else last1(ns.tail)
  }
  last1(List(1,2,3))
}
{
  def last2(ns: Seq[Int]): Option[Int] = {
    ns match {
      case Nil => None
      case n :: Nil => Option(n)
      case _ => last2(ns.tail)
    }
  }
  last2(Seq(1, 2, 3))
}