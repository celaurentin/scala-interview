import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CollectionTest extends AnyFlatSpec with Matchers {

  /////////////////////////////////////////////////////////////////////////////

  "Range" should "be the difference between the largest and smallest numbers" in {
    range(3, 17, 15, 11, 9) should be(14)
    range(-100, 0, 12, 33) should be(133)
    range(-10, -2) should be(8)
  }

  def range(numbers: Int*): Int = ???

  /////////////////////////////////////////////////////////////////////////////

  "Mean" should "be the average of the numbers" in {
    mean(13, 19, null, 14, 16, 5, 8) should be(12.5)
  }

  def mean(numbers: Integer*): Double = ???

  /////////////////////////////////////////////////////////////////////////////

  "Median" should "be the middle number in a sorted list when there is only one middle number" in {
    median(7, 11, 6, 2, 5) should be(6)
    median(7, 10, 3) should be(7)
  }
  "Median" should "be the average of the middle numbers in a sorted list when there are two middle numbers" in {
    median(13, 18, 14, 16, 5, 8) should be(13.5)
  }

  def median(numbers: Int*): Double = ???

  /////////////////////////////////////////////////////////////////////////////

  "Mode" should "be the most commonly occurring number(s) in a list" in {
    mode(5, 2, 3, 6, 4, 1, 3) should be(Array(3))
    mode(4, 5, 3, 1, 3, 2, 5, 6) should be(Array(3, 5))
    mode(4, 5, 5, 3, 1, 3, 2, 5, 6) should be(Array(5))
    mode(1, 3, 2, 4, 5) should be(Array(1, 2, 3, 4, 5))
  }

  def mode(numbers: Int*): Array[Int] = ???

  /////////////////////////////////////////////////////////////////////////////

  "Longest" should "be the longest word that uses all letters once" in {
    findLongest(List("aaeei", "gold", "air")) should be("gold")
  }

  def findLongest(words: List[String]): String = ???

}
