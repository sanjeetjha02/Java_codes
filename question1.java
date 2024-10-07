/*Write a Java program to get a number from the user and print whether it is positive or negative. */

package conditional_statements;

import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number :");
        int number = scanner.nextInt();
        if(number > 0){
            System.out.println("The number is positive :");
        } else if (number < 0){
            System.out.println("The number is negative :");
        } else {
            System.out.println("the number is zero :");
        }

        }
    }
