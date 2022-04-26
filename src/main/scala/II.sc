def penultimate[A](ls: List[A]): A= ls match{
  case h :: m:: Nil=> h
  case _ :: tail => penultimate(tail)
  case _         => throw new NoSuchElementException
}
penultimate(List(1,2,3,4))