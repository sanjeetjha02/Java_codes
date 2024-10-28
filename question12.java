/*
Write a Java program to display n terms of natural numbers and their sum.
 */
package conditional_statements;

import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("The first " + n + " natural no are: ");

        for (int i = 1; i<=n; i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nsum of the first"+ n +"natural  no is "+ sum );
    }
}
