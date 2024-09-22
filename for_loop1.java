import java.util.Scanner;

public class for_loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter stsrting point");
        int a = sc.nextInt();
        System.out.println("enter ending point");
        int b = sc.nextInt();
        for(int i=a; i>=b; i--){
            System.out.println(i);
        }
    }
    
}
