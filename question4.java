/*
Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
 */
package conditional_statements;

import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter a number: ");
        double num =  scanner.nextDouble();

        if (num == 0) {
            System.out.println("zero");
        } else {
            if (num > 0) {
                System.out.print("positive");
            } else {
                System.out.print("negative");
            }

            if (Math.abs(num) < 1) {
                System.out.println(" small");
            } else if (Math.abs(num) > 1000000) {
                System.out.println(" large");
            } else {
                System.out.println();
            }
        }
    }
}
/*
Import necessary classes: Import the java.util.Scanner class for user input.

Create a Scanner object: Create a Scanner object to read user input from the console.

Prompt the user: Display a message prompting the user to enter a floating-point number.

Read the input: Use the Scanner object's nextDouble() method to read the user's input and store it in a double variable.

Check for zero: If the input is zero, print "zero".

Check for positivity or negativity: If the input is not zero, check if it's positive or negative. Print "positive" if it's greater than zero and "negative" if it's less than zero.

Check for small or large: Calculate the absolute value of the input using Math.abs(). If the absolute value is less than 1, print "small". If the absolute value is greater than 1,000,000, print "large".


The program reads a floating-point number from the user and classifies it based on its value:

If the number is zero, it prints "zero".
If the number is positive, it prints "positive".
If the number is negative, it prints "negative".
If the absolute value of the number is less than 1, it prints "small".
If the absolute value of the number is greater than 1,000,000, it prints "large". */
