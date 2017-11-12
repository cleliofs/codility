object BinaryGap {

  object Solution {
    def solution(n: Int): Int = {
      // write your code in Scala 2.12
      val b = n.toBinaryString
      val a = b.split("1").filterNot(_.isEmpty).filter(d => b.contains(s"1${d}1")).map(_.size)
      if (a.nonEmpty) a.max else 0
    }
  }

  def main(args: Array[String]): Unit = {
    println(Solution.solution(9))
    println(Solution.solution(529))
    println(Solution.solution(20))
    println(Solution.solution(15))
  }

}
