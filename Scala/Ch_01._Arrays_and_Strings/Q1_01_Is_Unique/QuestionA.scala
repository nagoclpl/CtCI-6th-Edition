/**
 * Question A
 */
object QuestionA extends App {

  /**
   * Does str have unique chars in it?
   */
  def isUniqueChars(str: String): Boolean = {

    if (str.size > 128) {
      return false
    }

    val char_set = new Array[Boolean](128)

    for (i <- 0 to str.size-1) {
      val v = str.charAt(i)
      // uncomment the line below to understand/debug
      // println(s"v:${v}, v.toInt:${v.toInt}")
      if (char_set(v)) return false
      char_set(v) = true
    }

    true
  }

  /**
   * The execution starts here
   */

  val words = List("abcde", "hello", "apple", "kite", "padle")

  words.foreach(word => printf("%9s: %-9s\n", word, isUniqueChars(word)))
}
