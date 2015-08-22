/**
 * Created by Romero on 15/08/2015.
 */
public class Problem3 {
    /**
     *
     * Problem 3
     *
     * The prime factors of 13195 are 5, 7, 13 and 29.
     * What is the largest prime factor of the number 600851475143 ?
     *
     */
    public static void primeFactor(int num) {
        int[] primeFactors = new int[num/2];

        for (int a = 2; a < num; a++) {
            if (num % 2 == 0) {
                int divisionResult = num / 2;

                if (!Utils.isPrime(divisionResult)) {

                }
            }
        }
    }


}
