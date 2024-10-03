import java.util.Scanner;
public class switch_case1 {
    public static void main(String[] args) {
        System.out.println("enter name : ");
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        switch(name){
            case "sanjeet":
            System.out.println("you are first");
            System.out.println("thanks for perticipating !");
            break;
            case "nikhil":
            System.out.println("you are second");
            System.out.println("thanks for perticipating !");
            break;
            case "prince":
            System.out.println("you are third");
            System.out.println("thanks for perticipating !");
            break;
            case "poojadidi":
            System.out.println("you are fail");
            System.out.println("thanks for perticipating !");
            break;
            default:
            System.out.println("you didn't participated");

        }
        

        
    }
    
}
