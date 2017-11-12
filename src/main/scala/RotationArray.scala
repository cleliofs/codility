import scala.annotation.tailrec

object RotationArray {

  def main(args: Array[String]): Unit = {

    def solution(a: Array[Int], k: Int): Array[Int] = {

      def rotateOnce(a: Array[Int]): Array[Int] = {
        if (a.isEmpty) a else Array(a(a.length-1)) ++ a.dropRight(1)
      }

      @tailrec
      def rotate(a: Array[Int], count: Int): Array[Int] = {
        if (count == 0)
          a
        else rotate(rotateOnce(a), count-1)
      }

      def rotate2(a: Array[Int], count: Int): Array[Int] = {
        var res = a
        (1 to count).foreach { _ =>
          res = rotateOnce(res)
        }

        res
      }

//      rotate(a, k)
      rotate2(a, k)
    }




    solution(Array(), 3).foreach(println)
    solution(Array(3, 8, 9, 7, 6), 3).foreach(println)

  }

}
