/*
Write a Java program that displays the sum of n odd natural numbers.
 */
package conditional_statements;

import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number of terms: ");
        int n = in.nextInt();
        int sum = 0;

        System.out.println("\nThe odd numbers are:");
        for (int i = 1; i <= n; i++) {
            int oddNumber = 2 * i - 1;
            System.out.println(oddNumber);
            sum = sum+oddNumber;
        }
        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
    }
}
