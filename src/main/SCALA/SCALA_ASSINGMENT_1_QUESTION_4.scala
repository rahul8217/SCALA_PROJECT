object SCALA_ASSINGMENT_1_QUESTION_4 extends App {
  def addingWordToString(string1: String): String = {
    if (string1.isEmpty())
      return "The given string is NULL"
    if (string1.startsWith("if"))
      string1
    else
      "if" + " " + string1
  }
  println(addingWordToString("you are much better than others so do not listen to their opinion about yourself unless its regarding your betterment"))
  println(addingWordToString("if you can think about it then you can achieve it"))
  println(addingWordToString(""))

}
