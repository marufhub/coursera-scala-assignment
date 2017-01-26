package week2

/**
  * Created by maruf on 1/24/17.
  */
object FunctionalSets extends App{
  type Set = Int => Boolean

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def singletonSet(i: Int): Set = Set(i)

  def union(s1: Set, s2: Set): Set = (i: Int) => s1(i) || s2(i)

  def intersect(s1: Set, s2: Set): Set = (i: Int) => s1(i) && s2(i)

  def diff(s1: Set, s2: Set): Set = (i: Int) => s1(i) && !s2(i)

  def filter(s: Set, p: Int => Boolean): Set = (i: Int) => s(i) && p(i)

  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(i: Int): Boolean = {
      if(i > 1000) true
      else if (contains(s, i)) p(i) && iter(i + 1)
      else iter(i + 1)
    }
    iter(-1000)
  }

  def exists(s: Set, p: Int => Boolean): Boolean = {

    def iter(i: Int): Boolean = {
      if (i > 1000) false
      else if (contains(s, i)) p(i) || iter(i + 1)
      else iter(i + 1)
    }
    iter(1000)
  }

  def map(s: Set, f: Int => Int): Set = (y: Int) => {
    def iter(i: Int): Boolean = {
      if (i > 1000) false
      else if (contains(s, i)) (f(i) == y) || iter(i + 1)
      else iter(i + 1)
    }
    iter(-1000)
  }

}
