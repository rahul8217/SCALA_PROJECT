import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_1_QUESTION_6_TEST extends AnyFunSuite{
  test(testName = "Checking whether the two numbers are in the range of the given number"){
    assert(SCALA_ASSINGMENT_1_QUESTION_6.checkingRangeOfTwoNumbers(20, 60) == true)
    assert(SCALA_ASSINGMENT_1_QUESTION_6.checkingRangeOfTwoNumbers(21, 50) == false)
    assert(SCALA_ASSINGMENT_1_QUESTION_6.checkingRangeOfTwoNumbers(10, 55) == true)
    assert(SCALA_ASSINGMENT_1_QUESTION_6.checkingRangeOfTwoNumbers(30, 55) == false)
  }

}
