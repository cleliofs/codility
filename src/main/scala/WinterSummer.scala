import scala.annotation.tailrec

object WinterSummer {

  object Solution {
    def solution(t: Array[Int]): Int = {

      @tailrec
      def findPartition(a: List[Int], maxWinterTemp: Int, pos: Int): Int = {
        a match {
          case _ :: Nil => pos

          case x :: xs =>
            if (maxWinterTemp < x) pos
            else findPartition(xs, maxWinterTemp, pos+1)

        }
      }

      findPartition(t.tail.toList, t.head, 1)
    }
  }

}
