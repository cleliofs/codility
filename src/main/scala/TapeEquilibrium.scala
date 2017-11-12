import scala.annotation.tailrec

/**
  * Lesson 3: Time Complexity
  */
object TapeEquilibrium {

  def main(args: Array[String]): Unit = {

    def solution(a: Array[Int]): Int = {

      def splitDifference(a: Array[Int], p: Int): Int = {
        val (p1, p2) = a.splitAt(p)
        Math.abs(p1.sum - p2.sum)
      }

      @tailrec
      def splitDifference2(a: Array[Int], leftSum: Int, res: Int): Int = {
        a match {
          case Array() => res

          case Array(h, t) =>
            val newLeftSum = leftSum + h
            val v = Math.abs(newLeftSum - t)
            if (v < res) splitDifference2(Array(), newLeftSum, v)
            else splitDifference2(Array(), newLeftSum, res)

          case Array(h, tail@_*) =>
            val newLeftSum = leftSum + h
            // tail.sum O(N)!!!!
            val v = Math.abs(newLeftSum - tail.sum)
            if (v < res) splitDifference2(tail.toArray, newLeftSum , v)
            else splitDifference2(tail.toArray, newLeftSum, res)
        }
      }

//      // a value greater than any possible element in the array
//      val initialRes = 999999999
//      splitDifference2(a, 0, initialRes)

      def diffAbs(a: Int, b: Int): Int = if (a - b < 0) b - a else a - b

      @tailrec
      def findDiff(list: List[Int], leftSum: Int, rightSum: Int, diff: Int): Int = {
        list match {
          case x1 :: x2 :: Nil =>
            val curDiff = diffAbs(leftSum, rightSum)
            val bestDiff = if (curDiff < diff) curDiff else diff
            findDiff(list.tail, leftSum + x1, rightSum - x1, bestDiff)
          case _ => diff
        }
      }

      val leftSum = a(0)
      val rightSum = a.tail.sum

      val diff = diffAbs(leftSum, rightSum)
      findDiff(a.toList.tail, leftSum, rightSum, diff)

    }

//    println(solution(Array()))
//    println(solution(Array(-1000, 1000)))
    println(solution(Array(3, 1, 2, 4, 3)))
  }

}
