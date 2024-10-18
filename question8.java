/*
Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
 */
package conditional_statements;

import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("import first no :");
        double x = sc.nextDouble();

        System.out.println("import second no : ");
        double y = sc.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x==y){
            System.out.println("they are the same upto three decimals");
        }
        else {
            System.out.println("not same");
        }
    }
}
