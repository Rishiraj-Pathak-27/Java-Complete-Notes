// Write separate methods to:

// Reverse a number
// Check palindrome number
// Check Armstrong number

import java.util.Scanner;
public class multipleFunction {
    
    // function to find reverse of a number
    public static int reverse(int n) {
        int reverse = 0;

        while(n!=0) {
        int rem = n%10;
        reverse = (reverse * 10) + rem;
        n = n / 10;
        }
        return reverse;
    }

    // function to check wheather a number is palindrom or not
    public static boolean isPalindrome(int n) {
        int temp = n;
        int reverse = 0;

        while(temp!=0) {
            int rem = temp%10;
            reverse = (reverse * 10) + rem;
            temp = temp / 10;
        }

        return n == reverse;
    }

    // function to check wheather a number is Armstrong or not
    public static boolean isArmstrong(int n) {
        int count = 0;
        int temp = n;

        while(temp!=0) {
            int rem = temp%10;
            count++;
            temp/=10; 
        }
        
        temp = n;
        int sum = 0;

        while(temp>0) {
            int rem = temp%10;
            sum=sum+(int)(Math.pow(rem,count));
            temp/=10;
        }        

        return n == sum;
    }


    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number to check reverse: ");
        int n = ip.nextInt();
        System.out.println("Reverse Number = "+reverse(n));

        System.out.print("Enter a number to check palindrome: ");
        int num = ip.nextInt();
        System.out.println("Is Palindrome = "+isPalindrome(num));

        System.out.print("Enter a number to check Armstrong: ");
        int numeric = ip.nextInt();
        System.out.println("Is Armstrong = "+isArmstrong(numeric));
    }
}