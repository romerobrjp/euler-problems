import java.sql.Time;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 * Created by Romero on 15/08/2015.
 */
public class Problem5 {
    /**
     * Problem 5 - Smallest multiple
     * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
     * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
     */
    public static void smallestMultiple(int goal) {
        int b = 1;
        int lastDivisible = b;

        long begin = Calendar.getInstance().getTimeInMillis();
        for (int a = 2; a <= goal; a++) {
            if (b % a == 0) {
                lastDivisible = b;
                continue;
            }
            else {
                a = 2;
                b++;
            }
        }
        System.out.println(" >>> " + b + " is the smallest positive number that can be divided by all of the numbers from 1 to " + goal + "!");
        System.out.println((Calendar.getInstance().getTimeInMillis() - begin) + " milliseconds");
    }
}
