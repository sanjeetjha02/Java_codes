/*
Write a Java program to display the cube of the given number up to an integer.
 */
package conditional_statements;

import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("number: " + i + ",cube: " +(i * i * i));
        }
    }
}
