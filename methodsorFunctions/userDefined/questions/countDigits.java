// Write a method countDigits(int n) that counts the digits of a number.

public class countDigits {

    public static int countDigit(int n) {
        int count = 0;
        n = Math.abs(n);
        
        // while(n != 0) {
        //     count++;
        //     n /= 10;
        // }
        // return count;

        // OR

        while(n!=0) {
            int rem = n % 10;
            count++;
            n/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 343888843;
        System.out.println("Digit Count = "+countDigit(n));
    }
}


