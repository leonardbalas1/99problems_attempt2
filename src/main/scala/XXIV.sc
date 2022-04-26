import scala.util.Random

def nrandom(n:Int, m: Int)={
  val r= new Random()
  1 to n map{ _ =>r.nextInt(m) }
}
nrandom(5, 60)
