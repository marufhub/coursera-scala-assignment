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
  
}
