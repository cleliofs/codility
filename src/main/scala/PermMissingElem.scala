import scala.annotation.tailrec

object PermMissingElem {

  def main(args: Array[String]): Unit = {

    def solution(a: Array[Int]): Int = {
      // write your code in Scala 2.12
//      a.sorted.sliding(2,1).flatMap(s => {
//        val lastElement = s.last
//        if ((lastElement - s.head) != 1) Some(lastElement - 1) else None
//      }).find(_ != 0).getOrElse(1)

      @tailrec
      def findMissing(sortedArray: Array[Int], missing: Int): Int = {
        if (sortedArray.isEmpty) missing
        else if (sortedArray.head != missing) missing
        else findMissing(sortedArray.tail, missing+1)
      }

      findMissing(a.sorted, 1)

    }

    println(solution(Array()))
    println(solution(Array(4)))
    println(solution(Array(6, 2)))
    println(solution(Array(7,3,2,4,1)))
    println(solution(Array(2,3,1,5)))

  }

}
