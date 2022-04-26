{
  def palindrome(ls: List[Int]): Boolean = {
    ls match {
      case Nil => true
      case List(a) => true
      case list => list.head == list.last && palindrome(list.tail.init)
    }
  }
  palindrome(List(1, 2, 3, 2, 1))
}
{
  def palindrome3(ns: List[Int]): Boolean={
    if (ns.isEmpty) true
    else if (ns.length == 1) true
    else if (ns.head == ns.last) palindrome3(ns.dropRight(1).tail)
    else false
  }
  palindrome3(List(1, 2, 3, 2, 1))
}
{
  def palindrome2(ns: List[Int]): Boolean={
    ns==ns.reverse
  }
  palindrome2(List(1, 2, 3, 2, 1))
}
