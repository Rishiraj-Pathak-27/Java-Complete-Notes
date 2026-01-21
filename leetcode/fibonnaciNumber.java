import java.util.Scanner;
public class fibonnaciNumber {
    public static int fib(int n) {
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt(); 
        System.out.println("Fibonnaci Number = "+fib(n));
    }
}