def removeAt(value: Int, value1: List[Char])={
  value1.splitAt(value)._1.init:::value1.splitAt(value)._2
}

removeAt(3, List('a', 'b', 'c', 'd'))