object Solution2 {

  def solution(s: String, t: String): Boolean = {
    // write your code in Scala 2.12

    def allMatchingForOCRStrings(s: String, t: String) = {
      def areOCRStringsOfSameLength(expandedOcrS: String, expandedOcrT: String) = expandedOCRForS.length == expandedOCRForT.length

      def expandString(s: String) = {
        def fillWithQuestionMarks(n: Int): String = (1 to n).map(_ => '$').mkString

        s.map(c => if (c.isDigit) fillWithQuestionMarks(c.asDigit) else c.toString).mkString
      }

      lazy val expandedOCRForS = expandString(s)
      lazy val expandedOCRForT = expandString(t)

      areOCRStringsOfSameLength(expandedOCRForS, expandedOCRForT) && expandedOCRForS.zip(expandedOCRForT).forall { t =>
        val (c1, c2) = t
        c1 == c2 || Seq(c1, c2).contains('$')
      }
    }

    allMatchingForOCRStrings(s, t)
  }

  println(solution("A2Le", "2pL1")) // True -> a$$Le, $$pL$
  println(solution("a10", "10a")) // True
  println(solution("ba1", "1Ad")) // False
  println(solution("3x2x", "8")) // False

}
