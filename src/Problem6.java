import java.math.BigInteger;

/**
 * Created by Romero on 15/08/2015.
 */
public class Problem6 {
    /**
     *
     * The sum of the squares of the first ten natural numbers is,

     1² + 2² + ... + 10² = 385
     The square of the sum of the first ten natural numbers is,

     (1 + 2 + ... + 10)2 = 552 = 3025
     Hence the difference between the sum of the squares of the first ten natural numbers and
     the square of the sum is 3025 ? 385 = 2640.

     Find the difference between the sum of the squares of the
     first one hundred natural numbers and the square of the sum.
     *
     */
    public static void problem6(int goal) {
        long sum = 0;
        long sumOfTheSquares = 0;

        for (int a = 1; a <= goal ; a++) {
            sumOfTheSquares += (a * a);
            sum += a;
        }

        double squareOfTheSum = sum * sum;

        System.out.println(" >>> The sum of the squares of the first X natural numbers is: " + sumOfTheSquares);
        System.out.println(" >>> The Square of the sum of the first X natural numbers is: " + squareOfTheSum);
        System.out.println(" >>> The difference between the sum of the squares of the first ten natural numbers and\n" +
                "     the square of the sum: " + (double) (sumOfTheSquares - squareOfTheSum));
    }
}
