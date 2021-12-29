object SCALA_ASSINGMENT_1_QUESTION_7 extends App {
  def checkingCharacterIsHappyOrNot(string1: String, positionValue: Int): String = {
    var check = false
    if (string1.isEmpty())
      return "The given string is NULL"
    if (positionValue > string1.length)
      return "Provide a correct position value PLEASE"
    if (positionValue >= 0 && positionValue <= string1.length)
      if (string1.charAt(positionValue) == string1.charAt(positionValue - 1))
        "HAPPY"
      else if (string1.charAt(positionValue) == string1.charAt(positionValue + 1))
        "HAPPY"
      else
        "NOT HAPPY"
    else
      "BOTH CONDITION FAIL"
  }
  println(checkingCharacterIsHappyOrNot("rahul", 2))
  println(checkingCharacterIsHappyOrNot("happy", 3))
  println(checkingCharacterIsHappyOrNot("", 7))
  println(checkingCharacterIsHappyOrNot("engineer", 11))
}
