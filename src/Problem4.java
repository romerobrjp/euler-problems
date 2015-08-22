/**
 * Created by Romero on 15/08/2015.
 */
public class Problem4 {
    /**
     *
     * Problem 4 - Largest palindrome product
     *
     * A palindromic number reads the same both ways. The largest palindrome
     * made from the product of two 2-digit numbers is 9009 = 91 * 99.
     * Find the largest palindrome made from the product of two 3-digit numbers.
     *
     */
    public static void largestPalindromeOfThreeDigits() {
        Integer largestPalindrome = 0;

        for (int a = 999; a > 99; a--) {
            for (int b = 999; b > 99; b--) {
                Integer palindromeInt = a * b;

                //System.out.println(" > " + a + " - " + b);

                if (!palindromeInt.toString().substring(0, 1).equals(palindromeInt.toString().substring(palindromeInt.toString().length() - 1))
                        || palindromeInt.toString().length() < 6
                        || ((a * b) < largestPalindrome)
                        ) {
                    //System.out.println(" >>> " + palindromeInt + " is NOT a palindrome");
                    continue;
                }

                String palindromeStr = palindromeInt.toString();
                int palindromeLength = palindromeStr.length();
                String firstPart = palindromeStr.substring(0, (palindromeLength / 2));
                String secondPart = palindromeStr.substring((palindromeLength / 2));
                String secondPartReverse = "";

                for (int c = secondPart.length(); c >= 1; c--) {
                    secondPartReverse += secondPart.charAt(c-1);
                }

                char[] firstPartArray = firstPart.toCharArray();
                char[] secondPartReverseArray = secondPartReverse.toCharArray();

                boolean isPalindrome = false;

                for (int d = 0; d < firstPart.length(); d++) {
                    if (firstPartArray[d] != secondPartReverseArray[d]) {
                        //System.out.println(" >>> " + firstPart + "" + secondPart + " is NOT a palindrome");
                        isPalindrome = false;
                        break;
                    }
                    else {
                        isPalindrome = true;
                    }
                }

                if (isPalindrome && (a * b) > largestPalindrome) {
                    largestPalindrome = a * b;
                }
            }
        }

        System.out.println(" >>> " + largestPalindrome + " is the largest palindrome");
    }
}
