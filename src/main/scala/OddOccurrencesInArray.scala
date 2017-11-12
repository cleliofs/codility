/**
  * Lesson 2: Arrays
  */
object OddOccurrencesInArray {

  object Solution {

    def solution(a: Array[Int]): Int = {
//        val res = a.flatMap(e => a.groupBy(_ == e)).filter(t => t._1).map(_._2).filter(_.length == 1).flatten
//        val res = a.map(e => (e, a.count(_ == e))).filter(_._2 == 1)
//        val res = a.flatMap(e => {
//          val c = a.count(_ == e)
//          if (c == 1) Some(e) else None
//        })
//        if (res.length == 1) res(0) else 0

      a.groupBy(identity).find(t => t._2.length == 1).map(_._1).getOrElse(0)
    }
  }

  def main(args: Array[String]): Unit = {
    println(Solution.solution(Array(9, 3, 9, 3, 9, 7, 9)))
    println(Solution.solution(Array(8, 3, 6, 0, 1, 8, 3, 0, 6)))
  }

}
