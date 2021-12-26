import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_1_QUESTION_3_TEST extends AnyFunSuite{
  test(testName = "Adding a Character to Front and Back"){
    assert(SCALA_ASSINGMENT_1_QUESTION_3.addingCharFrontAndBack("SCALA") == "ASCALAA")
    assert(SCALA_ASSINGMENT_1_QUESTION_3.addingCharFrontAndBack("R") == "R")
    assert(SCALA_ASSINGMENT_1_QUESTION_3.addingCharFrontAndBack("")=="The given string is NULL")
  }

}
