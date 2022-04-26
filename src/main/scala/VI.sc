def palindrome(ls: List[Int]): Boolean={
  ls match{
    case Nil=> true
    case List(a)=> true
    case list=> list.head==list.last && palindrome(list.tail.init)
  }
}

palindrome(List(1,2,3,2,1))
