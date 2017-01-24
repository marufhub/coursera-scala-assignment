package exercise2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by maruf on 1/18/17.
  */
@RunWith(classOf[JUnitRunner])
class Main$Test extends FunSuite {
  test("balance((if (zero? x) max (/ 1 x))) = true "){
    assert(Main.balance("(if (zero? x) max (/ 1 x))".toList) === true )
  }

  test("balance(I told him (that it’s not (yet) done). (But he wasn’t listening)) = true "){
    assert(Main.balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList) === true )
  }

  test("balance(:-)) = false "){
    assert(Main.balance(":-)".toList) === false )
  }

  test("balance(())() = false "){
    assert(Main.balance("())(".toList) === false )
  }

}
