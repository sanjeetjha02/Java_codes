/*
Write a Java program that takes three numbers from the user and prints the greatest number.
 */
package conditional_statements;

import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter three numbers a,b,c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b){
            System.out.println("a is greater");
        }else if (b>c){
            System.out.println("b is a greater no.");
        } else if (c>a) {
            System.out.println("c is agreater no.");
        }else {
            System.out.println("no is invalid");
        }
    }
}
