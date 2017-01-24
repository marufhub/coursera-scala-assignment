package exercise2

/**
  * Created by maruf on 1/18/17.
  */
object Main extends App{

  /**
    *
    * @param chars
    * @return
    */
  def balance (chars: List[Char]): Boolean = {
    def parenthesisBalancer(chars: List[Char], sum: Int): Boolean = {
      if(chars.isEmpty) sum == 0
      else {
        if(chars.head == '(') {sum >= 0 && parenthesisBalancer(chars.tail, sum + 1)}
        else if (chars.head == ')') { parenthesisBalancer(chars.tail, sum - 1)}
        else parenthesisBalancer(chars.tail, sum)
      }
    }

    parenthesisBalancer(chars, 0)

  }

}
