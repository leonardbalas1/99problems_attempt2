import scala.::

def range(n:Int, m: Int)={
 List.range(n, m)}
range(2,9)

def range2(start: Int, end: Int): List[Int]={
 def rangeinside(end: Int, result: List[Int]): List[Int]={
  if(end<start) result
  else rangeinside(end-1, end :: result)
 }
 rangeinside(end, Nil)
}
range2(7,80)
