import scala.annotation.tailrec

/**
  * John was sitting near to a fireplace in his house, trying to get some warmth from the fire. Fighting his cold at the end of a freezing, short, dark winter day, he started wondering why it always had to be so cold during this season. That was when he came up with an idea.

John stated that winter is the initial part of the year in which it is always colder than in the remaining part. This latter part is called 'summer'. Then he assumed that summer is always warmer than winter; that is, any temperature measured in winter is colder than every temperature measured in summer.

Then he searched the Internet and found the previous year's meteorological data, which contained the year's temperature measurements. He began to wonder if it might be possible to divide the year into winter and summer so that winter comes before summer and each winter's temperature measurement is smaller than any temperature measured in summer. In case there are many such possible partitions, find the one in which the winter period is as short as possible. (It is quite cold now; there is really no reason for winter to be longer than necessary...)

Write a function:

function solution(T);
that, given a sequence T of temperature measurements (specified as integer numbers), finds the partition of the year into winter and summer that meets the conditions above and makes winter as short as possible, then returns the length of the winter. Both winter and summer have to be at least one day long. You can assume that there exists at least one partition that satisfies this condition.

For example, given:

T = [5, -2, 3, 8, 6]
the function should return 3, as after partitioning the year into winter: [5, -2, 3] and summer: [8, 6], each winter's measurement is smaller than each summer's temperature.

On the other hand, for the following array:

T = [-5, -5, -5, -42, 6, 12]

the function should return 4. The partition that minimizes the length of the winter is [-5, -5, -5, -42] and [6, 12]. Winter could also have length 5, but the function should return the shortest possible winter.

Assume that:

N is an integer within the range 2..300,000;

each element of array T is an integer within the range  −1,000,000,000..1,000,000,000];

There will be at least one correct way to divide the year into winter and summer.

Complexity:

expected worst-case time complexity is O(N)
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
  */
object WinterSummer {

  object Solution {
    def solution(t: Array[Int]): Int = {

      @tailrec
      def findPartition(a: List[Int], maxWinterTemp: Int, firstSummerTemp: Option[Int], index: Int, firstSummerTempPos: Int): Int = {
        a match {
          case _ :: Nil =>
            if (firstSummerTemp.isEmpty) index - 1 else firstSummerTempPos - 1

          case x :: xs =>

            if (firstSummerTemp.isEmpty) {
              // find next potential first summer temp
              if (x > maxWinterTemp) {
                findPartition(xs, maxWinterTemp, Some(x), index+1, index)
              } else {
                // just move to next element
                findPartition(xs, maxWinterTemp, firstSummerTemp, index+1, firstSummerTempPos)
              }
            } else {
              if (x < maxWinterTemp) {
                // reset first summer temp to None
                findPartition(xs, firstSummerTemp.get, None, index+1, firstSummerTempPos)
              } else {
                // just move to next element
                findPartition(xs, maxWinterTemp, firstSummerTemp, index+1, firstSummerTempPos)
              }
            }
        }
      }

      findPartition(t.toList, t.head, None, 1, 1)
    }
  }

}
