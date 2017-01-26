package week2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import FunctionalSets._
/**
  * Created by maruf on 1/25/17.
  */
@RunWith(classOf[JUnitRunner])
class FunctionalSets$Test extends FunSuite {

  test("Test SingletonSet"){
    assert(contains(singletonSet(1), 1))
  }

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  test("Test Union operation"){
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 2))
      assert(contains(s, 1))
      assert(!contains(s, 3))
    }
  }

  test("Test filter operation"){
    new TestSets {
      val s = union(s1, s2)
      assert(contains(filter(s, x => x > 0), 1))
    }
  }


}
