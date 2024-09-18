import java.util.Scanner;
public class conditonal {
    public static void main(String[] args) {
        System.out.print("enter age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18 && age<=80){
            System.out.println("he can drive");
        }
        else{
            System.out.println("he cannot drive");
        }
    }
    
}
