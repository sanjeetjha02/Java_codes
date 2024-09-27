import java.util.Scanner;
public class markstoper {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter maths marks : ");
        float maths = sc.nextFloat();
        System.out.println("enter physics marks :");
        float physics = sc.nextFloat();
        System.out.println("enter civic marks :");
        float civic = sc.nextFloat();
        System.out.println("sum is : ");
        float sum = maths+physics+civic;
        System.out.println(sum);
        System.out.println("percentage is : ");
        float percentage = (sum/300)*100;
        System.out.println(percentage);
    }
    
}
