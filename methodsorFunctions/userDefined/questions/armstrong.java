// WAP to check wheather a number is an Armstrong Number using function.

import java.util.Scanner;
public class armstrong {
    
    public static boolean isArmstrong(int n) {
        int temp = n;
        int count = 0;
        int sum = 0;

        while(temp!=0) {
            int rem = temp%10;
            count++;
            temp = temp/10;
        }
        System.out.println("Digit Count = "+count);

        temp = n;
        while(temp>0) {
            int rem = temp%10;
            sum = sum + (int)(Math.pow(rem,count));
            temp/=10;
        } 

        if(n == sum){
            return true;
        }
        return false;
    } 
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = ip.nextInt();

        System.out.println("Is Armstrong Number: "+isArmstrong(n));
    }
}

