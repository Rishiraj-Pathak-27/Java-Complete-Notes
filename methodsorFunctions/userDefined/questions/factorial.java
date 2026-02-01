// Write a method factorial(int n) that returns the factorial of a number.

public class factorial {
    
    public static int factorial(int n) {

        if(n <= 1) {
           System.out.println("Invalid Number, Factorial not possible!"); 
           return -1;
        }

        int fact = 1;

        for(int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial of "+n+" = "+factorial(n));
    }
}