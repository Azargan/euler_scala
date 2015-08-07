package first

/**
 * Created by azargan on 06.08.15.
 */
/*
 * Problem description:
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object Problem1 {

  def multipleForNumber(number: Int) : Int = {

    (1 until number).filter(i => i % 3 == 0 || i % 5 == 0).sum
  }

  def main(args: Array[String]) {
    println(multipleForNumber(1000))
  }

}
/*
 * Solved[06/08/15]: 233168
 */