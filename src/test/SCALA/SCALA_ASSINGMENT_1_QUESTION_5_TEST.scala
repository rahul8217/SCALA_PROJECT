import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_1_QUESTION_5_TEST extends AnyFunSuite{
  test(testName = "Checking for the 2  test number which one is nearest to the given number ") {
    assert(SCALA_ASSINGMENT_1_QUESTION_5.checkingNearestValueToGivenNumber(30, 40) == 40)
    assert(SCALA_ASSINGMENT_1_QUESTION_5.checkingNearestValueToGivenNumber(80, 20) == 80)
    assert(SCALA_ASSINGMENT_1_QUESTION_5.checkingNearestValueToGivenNumber(60, 60) == 0)
    assert(SCALA_ASSINGMENT_1_QUESTION_5.checkingNearestValueToGivenNumber(130, 50) == 130)
    assert(SCALA_ASSINGMENT_1_QUESTION_5.checkingNearestValueToGivenNumber(140, 110) == 110)
  }

}
