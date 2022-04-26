val min= List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
def spliting(n: Int, list: List[Char])={
  list.splitAt(n)
}
spliting(4, min)