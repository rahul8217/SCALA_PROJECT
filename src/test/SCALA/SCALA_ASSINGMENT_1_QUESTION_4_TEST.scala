import org.scalatest.funsuite.AnyFunSuite

class SCALA_ASSINGMENT_1_QUESTION_4_TEST extends AnyFunSuite{
  test(testName = "Adding a wornd in Front of a sting id it does not starts with the given word"){
    assert(SCALA_ASSINGMENT_1_QUESTION_4.addingWordToString("you are much better than others so do not listen to their opinion about yourself unless its regarding your betterment") == "if you are much better than others so do not listen to their opinion about yourself unless its regarding your betterment")
    assert(SCALA_ASSINGMENT_1_QUESTION_4.addingWordToString("if you can think about it then you can achieve it") == "if you can think about it then you can achieve it")
    assert(SCALA_ASSINGMENT_1_QUESTION_4.addingWordToString("") == "The given string is NULL")
  }

}
