package exercise3

/**
  * Created by maruf on 1/18/17.
  */
object Main extends App{
  def countChange(money: Int, coins: List[Int]): Int = {
    def counter(money: Int, coins: List[Int], count: Int): Int = {
      if (money < 0) count
      else {
        if (coins.isEmpty)
          if (money == 0 ) count + 1 else count
        else
          counter(money - coins.head, coins, count) + counter(money, coins.tail, count)
      }
    }
    counter(money, coins, 0)
  }
}
