package exercise3

/**
  * Created by maruf on 1/18/17.
  */
object Main extends App{
  val list = List(1,2,3).toSet[Int].subsets.map(_.toList).toList
  println(Set(1,2,3).subsets)


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
