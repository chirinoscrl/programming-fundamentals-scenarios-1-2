package co.edu.poli.algorithm.scenario2;

import java.util.Scanner;

/**
 * The DigitCounter class provides a method to count the number of digits in a given number.
 */
public class DigitCounter {

    /**
     * The main method reads a long integer from standard input and prints the number of digits.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Scanner instance to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Read a long integer from standard input
        long number = scanner.nextLong();

        // Count the number of digits in the number
        int digitCount = countDigits(number);

        // Print the number of digits
        System.out.println(digitCount);
    }

    /**
     * Counts the number of digits in a given number.
     *
     * @param number The number to count digits of.
     * @return The number of digits in the given number.
     */
    public static int countDigits(long number) {
        // Convert the number to its absolute value
        number = Math.abs(number);

        // Initialize the digit count
        int count = 0;

        // Count the digits by repeatedly dividing the number by 10
        while (number != 0) {
            count++;
            number /= 10;
        }

        // Handle the case when the number is 0
        return count == 0 ? 1 : count;
    }
}
