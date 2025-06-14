package src;

import java.util.HashSet;
import java.util.Set;

/**
 * This class checks whether a given number is a "Happy Number".
 * A Happy Number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * 
 * Example: 
 * 19 is a happy number: 1² + 9² = 82 → 8² + 2² = 68 → 6² + 8² = 100 → 1² + 0² + 0² = 1
 */
public class HappyNumber {

    /**
     * Main method to test the isHappy function with sample input.
     */
    public static void main(String[] args) {
        int number = 19;
        boolean result = isHappy(number);
        System.out.println("Is " + number + " a happy number? " + result);
    }

    /**
     * Checks whether a number is a happy number.
     *
     * @param n the number to check
     * @return true if the number is happy, false otherwise
     */
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquares(n);
        }

        return n == 1;
    }

    /**
     * Helper method to calculate the sum of the squares of digits of a number.
     *
     * @param number the input number
     * @return sum of squares of its digits
     */
    private static int sumOfSquares(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}
