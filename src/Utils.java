/**
 * Created by Romero on 16/08/2015.
 */
public class Utils {
    public static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }

        if (    num % 2 == 0) {
            return false;
        }

        for (int a = 3; a < num ; a++) {
            if ((num % a) == 0) {
                return false;
            }
        }
        return true;
    }
}
