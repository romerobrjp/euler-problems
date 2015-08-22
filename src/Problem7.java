import java.util.Calendar;

/**
 * Created by Romero on 16/08/2015.
 */
public class Problem7 {
    /**
     *
     * Problem 7 - The 1001st prime number
     *
     * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     * What is the 10001st prime number?
     *
     */
    public static void theNstPrimeNumber(int goal) {
        long begin = Calendar.getInstance().getTimeInMillis();

        long[] primes = new long[goal];
        int nextCandidate = 2;
        int primesCounter = 0;

        do  {
            if (Utils.isPrime(nextCandidate)) {
                primes[primesCounter] = nextCandidate;
                primesCounter++;
            }
            nextCandidate++;
        } while (primes[goal-1] == 0);

        /*for (int a = 0; a < primes.length; a++) {
            System.out.print(primes[a] + "; ");
        }*/

        System.out.println(" >>> " + goal + "st prime number is " + (primes[10000]));
        System.out.println(" > " + (Calendar.getInstance().getTimeInMillis() - begin) + " milliseconds");
    }
}
