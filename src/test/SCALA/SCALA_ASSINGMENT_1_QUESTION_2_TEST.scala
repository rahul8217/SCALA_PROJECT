import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_1_QUESTION_2_TEST extends AnyFunSuite{
  test(testName = "Remove Position Value of given String "){
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("SCALA", 2)=="SCLA")
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("SCALA", 1)=="SALA")
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("SCALA", 0)=="CALA")
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("SCALA", 3)=="SCAA")
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("S", 1)=="S")
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("", 3)=="The given string is NULL")
    assert(SCALA_ASSINGMENT_1_QUESTION_2.removeStringPositionValue("SCALA", 9)=="Position specified is greater than the string length")
  }

}
