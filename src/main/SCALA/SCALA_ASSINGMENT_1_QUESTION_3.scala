object SCALA_ASSINGMENT_1_QUESTION_3 extends App {
  def addingCharFrontAndBack(string1:String): String = {
    if (string1.isEmpty())
      return "The given string is NULL"
    if (string1.length <= 1)
      string1
    else
      string1.charAt(string1.length - 1) +: string1 :+ string1.charAt(string1.length - 1)
  }
  println(addingCharFrontAndBack("SCALA"))
  println(addingCharFrontAndBack("R"))
  println(addingCharFrontAndBack(""))
}
