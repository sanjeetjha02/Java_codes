import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        System.out.println("enter the age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){
            case 18:
            System.out.println("you are going to become an adult");
            break;
            case 23:
            System.out.println("you are going to join a job");
            break;
            case 27:
            System.out.println("you are going to be married");
            break;
            default:
            System.out.println("enjoy your life ");
        }
        
    }
    
}
 