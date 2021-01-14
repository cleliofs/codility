import scala.util.Try

object Solution extends App {
  def solution(a: Array[Int]): Boolean = {
    // write your code in Scala 2.12
    a.length % 2 == 0 && a.sorted.sliding(2, 2).forall(a => a(0) == a(1))
  }

  println(solution(Array(1, 2, 2, 1))) // True
  println(solution(Array(7, 7, 7))) // False
  println(solution(Array(1, 2, 2, 3))) // False
}


//val sortedList = a.distinct.filterNot(_ <= 0).sorted
//
//sortedList.sliding(2).collectFirst {
//  case Array(a, b) if a + 1 != b => a + 1
//}.getOrElse(Try(sortedList.last + 1).getOrElse(1))
