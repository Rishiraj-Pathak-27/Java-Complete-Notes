// Reverse String, given string in a character array

import java.util.Scanner;
public class reverseStrings  {

    public static void print(char[] arr){
        for(char ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void reverseString(char[] arr){
        print(arr);

        int n=arr.length;

        int left=0, right=n-1;

        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        print(arr);
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the length of char array: ");
        int n=ip.nextInt();

        char[] arr = new char[n];

        System.out.println("Enter characters in char array: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.next().charAt(0);
        }
        
        reverseString(arr);        
    }
}
