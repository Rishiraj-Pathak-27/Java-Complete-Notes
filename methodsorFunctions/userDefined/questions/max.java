// Write a method maxOfTwo(int a, int b) that returns the greater number.

public class max {
   
    public static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Greater = "+maxOfTwo(5, 9));
    }
}