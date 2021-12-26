object SCALA_ASSINGMENT_1_QUESTION_2 extends App {
  def removeStringPositionValue(str1: String, positionValue: Int): String = {
    var result = ""
    if (str1.isEmpty())
      return "The given string is NULL"
    if (str1.length() <= 1)
      str1
    else if (positionValue > str1.length - 1)
      "Position specified is greater than the string length"
    else {
      for (i <- 0 to str1.length - 1)
        {
          if (i != positionValue) {
            result += str1.charAt(i)
          }
        }
        result
    }
  }
  println(removeStringPositionValue("SCALA", 2))
  println(removeStringPositionValue("SCALA", 1))
  println(removeStringPositionValue("SCALA", 0))
  println(removeStringPositionValue("SCALA", 3))
  println(removeStringPositionValue("SCALA", 9))
  println(removeStringPositionValue("", 3))
}
