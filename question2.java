/*Write a Java program to solve quadratic equations (use if, else if and else).*/
package conditional_statements;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter cofficient of a: ");
        double a = scanner.nextDouble();

        System.out.println("enter cofficient of b: ");
        double b = scanner.nextDouble();

        System.out.println("enter cofficent of c: ");
        double c = scanner.nextDouble();

        double discriminant = b*b - 4*a*c;

        if (discriminant > 0){
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real roots: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            System.out.println("One real root: x1 = " + (-b / (2 * a)));
        } else {
            System.out.println("No real roots");
        }
    }
}


