package exercise1

/**
  * Created by maruf on 1/18/17.
  */
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class Main$Test extends FunSuite {
  test(" pascal( 0, 2 ) = 1"){
    assert(Main.pascal(0,2) === 1)
  }

  test(" pascal( 1, 2 ) = 2"){
    assert(Main.pascal(0,2) === 1)
  }

  test(" pascal( 1, 3 ) = 3"){
    assert(Main.pascal(0,2) === 1)
  }
}
