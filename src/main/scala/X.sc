import scala.collection.IterableOnce.iterableOnceExtensionMethods

def pack[A](ls: List[A]): List[List[A]] = {
  if (ls.isEmpty) List(List())
  else {
    val (packed, next) = ls span { _ == ls.head }
    if (next == Nil) List(packed)
    else packed :: pack(next)
  }
}
val z=pack(List("f","a","a","a","a","b","b","b","a","a","c","c","d","d","d"))

def addcount[A](list: List[List[A]])= {
  list.map(el => (el.length, el.head))
}
  addcount(z)
