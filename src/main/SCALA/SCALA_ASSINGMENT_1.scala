object SCALA_ASSINGMENT_1 extends App{
  def test(string1: String): String = {
    if (string1.length < 2) string1
    else string1.substring(0, 2) * 4
  }
  println(test(("INDIA")))
}

