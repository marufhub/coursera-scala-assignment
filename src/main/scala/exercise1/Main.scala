package exercise1

/**
  * Created by maruf on 1/17/17.
  */
object Main {

  /**
    * Exercise 1 pascale Triangle
    * @param c
    * @param r
    * @return
    */
  def pascal(c: Int, r: Int): Int = c match {
    case 0 => 1
    case c if c >= r => 1
    case _ => pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}
