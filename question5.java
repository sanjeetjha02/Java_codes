/*
Write a Java program that takes a number from the user and generates an integer between 1 and 7.
It displays the weekday name.
 */
package conditional_statements;

import java.util.Random;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day name :");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");// This should never happen
                break;
        }
    }
}

