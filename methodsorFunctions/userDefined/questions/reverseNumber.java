// Create a method reverseNumber(int n) that returns the reversed number.

import java.util.Scanner;
public class reverseNumber {
    
    public static int reverseDigit(int n) {   // n = 5462
        int reverse = 0;
        int rem;

        // can also use sign to start the reverse no with sign only
        
        // int sign = 1;

        // if(n < 0) {
        //     sign = -1;
        //     n = -n;
        // }

        while(n!=0) {
            rem = n%10;   // rem = 5
            reverse = (reverse * 10) + rem;   // reverse = 5
            n/=10;  // n = 1234.5 == 1234
        }
        return reverse;     // 2645

        // return reverse * sign;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = ip.nextInt();   // 5462

        System.out.println("Reverse Number = "+reverseDigit(num));

    }
}