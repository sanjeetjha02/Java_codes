import java.util.Scanner;
public class strmethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //name.length(); of the string
        System.out.println("enter string : ");
        String name = sc.nextLine ();
        int value =name.length();
        System.out.println(value);

        //name.tolowercase() of the string
        System.out.println("enter string 1 : ");
        String name1 = sc.nextLine();
        String value1 = name1.toLowerCase();
        System.out.println(value1); 

        //name.uppercase() of the string
        System.out.println("enter string 2 : ");
        String name2 = sc.nextLine();
        String value2 = name2.toUpperCase();
        System.out.println(value2); 

        //name.trim() of the string
        System.out.println("enter string 3 : ");
        String name3 = sc.nextLine();
        String value3 = name3.trim();
        System.out.println(value3); 

        //name.substring() of the string
        System.out.println("enter string 4 : ");
        String name4 = sc.nextLine();
        String value4 = name4.substring(2, 5);
        System.out.println(value4); 
        
        //name.replace() of the string
        System.out.println("enter string 5 : ");
        String name5 = sc.nextLine();
        String value5 = name5.replace("lep", "pit");//use this '' to replace single alphabet
        System.out.println(value5); 

        //name.startswith() of the string
        System.out.println("enter string 6 : ");
        String name6 = sc.nextLine();
        Boolean value6 = name6.startsWith("ele");//similarly variable.endewith() works eleminate last
        System.out.println(value6); 

        //name.charAt() of the string
        System.out.println("enter string 7 : ");
        String name7 = sc.nextLine();
        char value7 = name7.charAt(4);
        System.out.println(value7); 

        //name.indexof() of the string
        System.out.println("enter string 8 : ");
        String name8 = sc.nextLine();
        int value8 = name8.indexOf("n"); //similarly lastindexof() for last string 
        System.out.println(value8); 

        //name.equals() of the string
        System.out.println("enter string 9 : ");
        String name9 = sc.nextLine();
        boolean value9 = name9.equals("sanjeet");
        System.out.println(value9); 

        //name.equals() of the string
        System.out.println("enter string 9a : ");
        String name9a = sc.nextLine();
        boolean value9a = name9a.equalsIgnoreCase("sanjeet");
        System.out.println(value9a);//ignores upper and lower case


    }

}
 