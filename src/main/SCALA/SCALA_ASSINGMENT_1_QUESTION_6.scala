object SCALA_ASSINGMENT_1_QUESTION_6 extends App {
  def checkingRangeOfTwoNumbers(numberX1: Int, numberY1: Int): Boolean = {
    if (numberX1 <= 20 && numberY1 >= 50)
      true
    else
      false
  }
  println(checkingRangeOfTwoNumbers(20,60))
  println(checkingRangeOfTwoNumbers(21,50))
  println(checkingRangeOfTwoNumbers(10,55))
  println(checkingRangeOfTwoNumbers(30, 55))
}
