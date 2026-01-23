// pascal triangle is formed by using the combination (i.e ncr) where n is the total value and r is the choosed value out of n
// (icj) will be the formation of pascal triangle

// Pascal triangle using user defined function

import java.util.Scanner;

public class pascalTriangle {

    // function created to find the factorial of i,k & i-k
    public static int pascal(int x) {
        int fact = 1;
        for(int i = x; i>=1; i--) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        // code written to print the pattern of pascal
        for(int i = 0; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }

            for(int k = 0; k <= i; k++) {
                int ncr = pascal(i)/(pascal(k)*pascal(i-k));     // ncr = n!/r!(n-r)!
                System.out.print(ncr+"   ");
            }
            System.out.println();
        }
    }
}