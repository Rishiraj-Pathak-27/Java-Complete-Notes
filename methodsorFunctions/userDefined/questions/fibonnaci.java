// WAP to write a function to find finbonnaci series upto 'n'

import  java.util.Scanner;
public class fibonnaci {
    
    public static int fibonnaciUptoN(int n) {
        int first = 0;
        int second = 1;
        

        for(int i = 1; i <= n; i++) {
            System.out.print(first+" ");
            int next = first + second;  // a=1
            first = second;
            second = next;
        }
        return first;  // or second
    } 

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int num = ip.nextInt();
        System.out.print("Fibonnaci Series ");
        fibonnaciUptoN(num);
    }
}