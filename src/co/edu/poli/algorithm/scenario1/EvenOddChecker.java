package co.edu.poli.algorithm.scenario1;

import java.util.Scanner;

/**
 * The EvenOddChecker class provides a method to determine if a number is even or odd.
 */
public class EvenOddChecker {

    /**
     * The main method reads an integer from standard input and prints "even" if the number is even,
     * and "odd" if the number is odd.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Scanner instance to read from standard input
        Scanner scanner = new Scanner(System.in);

        // Read an integer from standard input
        int number = scanner.nextInt();

        // Define an array of strings with the possible results
        String[] results = {"even", "odd"};

        // Print the corresponding result using the value of number & 1 as the index
        System.out.println(results[number & 1]);
    }
}
