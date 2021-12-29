import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_1_QUESTION_7_TEST extends AnyFunSuite{
  test(testName = "Checking whether the given string with specified position is happy or not"){
    assert(SCALA_ASSINGMENT_1_QUESTION_7.checkingCharacterIsHappyOrNot("rahul", 2) == "NOT HAPPY")
    assert(SCALA_ASSINGMENT_1_QUESTION_7.checkingCharacterIsHappyOrNot("happy", 3) == "HAPPY")
    assert(SCALA_ASSINGMENT_1_QUESTION_7.checkingCharacterIsHappyOrNot("", 7) == "The given string is NULL")
    assert(SCALA_ASSINGMENT_1_QUESTION_7.checkingCharacterIsHappyOrNot("engineer", 11) == "Provide a correct position value PLEASE")}

}
