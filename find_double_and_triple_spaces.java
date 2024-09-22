public class find_double_and_triple_spaces {
    public static void main(String[] args) {
        String st = "my name is double    and triople  spaces";
        int zz = st.indexOf("  ");//long method
        System.out.println(zz);       //long method

        System.out.println(st.indexOf("   "));//same way but short method
    }
    
}
