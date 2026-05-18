// Taking feel of recursion through functions concept

public class feelOfRecursion{
    public static void main(String[] args){
        rishiraj();
    }

    public static void rishiraj(){
        System.out.println("Yash");
        rugved();
    }

    public static void rugved(){
        System.out.println("radha");
        mehak();
    }

    public static void mehak(){
        System.out.println("Rishiraj");
        rishiraj();
    }
}