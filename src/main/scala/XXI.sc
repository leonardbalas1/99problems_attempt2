def add(value: Int, value1: List[Char], value2: List[Char])={
  ( value1.splitAt(value)._1::: value2) ::value1.splitAt(value)._2
}
add(3, List('a', 'b', 'c', 'd'), List('z') )