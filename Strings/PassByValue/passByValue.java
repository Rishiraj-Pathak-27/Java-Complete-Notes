// String is a Pass by value because there is a independency between the main method String s & change function String s.

public class passByValue {
    public static void change(String s){
        s = "Rishiraj";
        System.out.println(s);
    }    

    public static void main(String[] args){
        String s = "John";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
