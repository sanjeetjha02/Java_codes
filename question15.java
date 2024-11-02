/*
Write a Java program to display the multiplication table of a given integer.
 */
package conditional_statements;

import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer to display its multiplication table: ");
        int number = sc.nextInt();

        System.out.println("Multiplication table for number : ");
        for (int i =1; i<=10; i++){
            System.out.println(number * i);
        }
    }
}
