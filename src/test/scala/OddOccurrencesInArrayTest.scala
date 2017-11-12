import OddOccurrencesInArray.Solution._
import org.scalatest.{FlatSpec, Matchers}

class OddOccurrencesInArrayTest extends FlatSpec with Matchers {

  "Solution" should "pass for all cases" in {
    solution(Array(9, 3, 9, 3, 9, 7, 9)) shouldBe 7
    solution(Array(8, 3, 6, 0, 1, 8, 3, 0, 6)) shouldBe 1
  }

}
