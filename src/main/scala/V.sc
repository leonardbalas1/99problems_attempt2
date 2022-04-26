def reverse1[A](ls: List[A]):List[A] = {
  ls match{
    case Nil=> Nil
    case h:: tail=> reverse1(tail)::: List(h)

  }
}
reverse1(List(1,2,3,4,5))
def reverse2[A](ls: List[A]):List[A] = {
  ls.foldLeft(List[A]())((x,s)=> s::x)
}

reverse2(List(1,2,3,4,5))
List(1,2,3)::: List(1)

