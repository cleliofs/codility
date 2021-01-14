import scala.util.Try

object Task1CheckPairs extends App {

  def Task1CheckPairs(a: Array[Int]): Boolean = {
    // write your code in Scala 2.12
    a.length % 2 == 0 && a.sorted.sliding(2, 2).forall(a => a(0) == a(1))
  }

  println(Task1CheckPairs(Array(1, 2, 2, 1))) // True
  println(Task1CheckPairs(Array(7, 7, 7))) // False
  println(Task1CheckPairs(Array(1, 2, 2, 3))) // False
}
