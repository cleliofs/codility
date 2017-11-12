import org.scalatest.{FlatSpec, Matchers}

class WinterSummerTest extends FlatSpec with Matchers {

  "Solution" should "pass" in {
    var a = Array(5, -2, 3, 8, 6)
//    WinterSummer.Solution.solution(a) shouldBe 3 // [5, -2, 3] and [8, 6]
//
//    a = Array(5, -2, 3, 8, 8)
//    WinterSummer.Solution.solution(a) shouldBe 3 // [5, -2, 3] and [8, 8]
//
//    a = Array(-5, -5, -5, -42, 6, 12)
//    WinterSummer.Solution.solution(a) shouldBe 4 // [-5, -5, -5, -42] and [6, 12]
//
//    a = Array(5, -2, 3, 4, 6)
//    WinterSummer.Solution.solution(a) shouldBe 4 // [5, -2, 3, 4] and [6]
//
//    a = Array(5, 6, 8, 10, 6)
//    WinterSummer.Solution.solution(a) shouldBe 1 // [5] and [6, 8, 10, 6]
//
//    a = Array(1, 5, 6, 8, 10, 6)
//    WinterSummer.Solution.solution(a) shouldBe 1 // [1] and [5, 6, 8, 10, 6]
//
//    a = Array(4, 6)
//    WinterSummer.Solution.solution(a) shouldBe 1 // [4] and [6]

    a = Array(4, 6, 2, 7, 9, 3, 18, 11, 15, 14)
    WinterSummer.Solution.solution(a) shouldBe 6 // [4, 6, 2, 7, 9, 3] and [18, 11, 15, 14]
  }

}
