object SCALA_ASSINGMENT_1_QUESTION_5 extends App {
  def checkingNearestValueToGivenNumber(number1: Int, number2: Int): Int = {
    if (number1 == number2)
      0
    else if (number1 <= 100 && number2 <= 100)
      if (Math.abs(number1) > Math.abs(number2))
        Math.abs(number1)
      else
        Math.abs(number2)
    else
      {
        var first = Math.abs(number1) - 100
        var second = Math.abs(number2) - 100
        if (first <= 0 || second <= 0) {
          first = -first
          second = -second
        }
        if (first < second)
          Math.abs(number1)
        else
          Math.abs(number2)
      }
  }
  println(checkingNearestValueToGivenNumber(30, 40))
  println(checkingNearestValueToGivenNumber(80, 20))
  println(checkingNearestValueToGivenNumber(60, 60))
  println(checkingNearestValueToGivenNumber(130, 50))
  println(checkingNearestValueToGivenNumber(140, 110))
}
