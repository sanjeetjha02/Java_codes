/*
Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
 */
package conditional_statements;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        int count = 5;  // We want to input 5 numbers

        // Loop to take 5 inputs from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();
            sum += number;  // Add the number to the sum
        }

        // Calculate the average
        double average = sum / (double)count;

        // Display the sum and average
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}
