// Write a method sumOfDigits(int n) that returns the sum of digits.

public class digitSum {
    
    public static int sumOfDigits(int n) {
        int sum = 0;

        while(n!=0) {
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 678788346;
        System.out.println("Sum of Digits = "+sumOfDigits(num));
    }
}