import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        System.out.println("input age : ");
         Scanner sc = new Scanner(System.in);
         float age = sc.nextFloat();
         if(age>=56){
            System.out.println("you are experienced ");
         }
         else if(age>=46){
            System.out.println("ypu are semi experienced");
         }
         else if(age>=36){
            System.out.println("you are semi-semi-experienced");
         }
         else if(age<36 && age>=18){
            System.out.println("you are semi-semi-semi experienced");
         }
         else{
            System.out.println("you are fesher");
         }

    }
    
}
