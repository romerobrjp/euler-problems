import java.util.Vector;

/**
 * Created by Romero on 15/08/2015.
 */
public class Problem1 {
    /**
     *
     * Problem 1 - Multiples of 3 and 5
     * If we list all the natural numbers below 10 that are multiples of 3 or 5,
     * we get 3, 5, 6 and 9. The sum of these multiples is 23.
     * Find the sum of all the multiples of 3 or 5 below 1000.
     *
     */
    public static void multiplesOfTwoNumbers(Integer num1, Integer num2, Integer limit) {
        Vector<Integer> allDivisibles = new Vector<Integer>();
        Integer totalSum = 0;

        for (int a = 1; a < limit; a++) {
            if ((a % num1) == 0) {
                allDivisibles.add(a);

                totalSum += a;
            }

            if (!allDivisibles.contains(a)) {
                if ((a % num2) == 0) {
                    allDivisibles.add(a);
                    totalSum += a;
                }
            }
        }

        System.out.println(" > Total sum: " + totalSum);
        System.out.println(" > " + num1 + " and " + num2 + " divisible numbers: " + allDivisibles.toString());
    }
}