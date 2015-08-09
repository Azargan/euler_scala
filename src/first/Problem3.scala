package first

import utils.Prime

/**
 * Created by azargan on 09.08.15.
 */
/*
 * Problem description:
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 */
object Problem3 {

  def getLargestPrimeFactor(number: Long) : Long = number match {
    case x if Prime.is(x) => x
    case _: Long =>
      var largest: Long = 1L
      Prime.primes.takeWhile(x => x < (number / 2)).foreach(x => if (number % x == 0) {println(x); largest = x})
      largest
    case _ => 0L
  }

  def main(args: Array[String]): Unit = {
    println(getLargestPrimeFactor(600851475143L))
  }
}
/*
 * [09/08/15]: Answer received (6857) but program didn't exit from method.
 */
