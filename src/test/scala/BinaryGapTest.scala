import BinaryGap.Solution.solution
import org.scalatest.{FlatSpec, Matchers}

class BinaryGapTest extends FlatSpec with Matchers {

  "Solution" should "pass for all inputs" in {
    solution(9) shouldBe 2
    solution(529) shouldBe 4
    solution(20) shouldBe 1
    solution(15) shouldBe 0
  }

}
