// WAP to find out the total sub arrays from an array (Brute Force Approach) T.C. -> O(n^3)

import java.util.Scanner;
public class subArrays{
    public static void totalSubArrays(int[] arr){
        int n=arr.length;

        // outer loop to traverse whole array
        for(int start=0; start<n; start++){
            // 1st inner loop to traverse from outer loop to n-1
            for(int end=start; end<n; end++){
                // 2nd inner loop to traverse from start to end (based on outer loop and 1st inner loop)
                for(int i=start; i<=end; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter total elements: ");
        int n=ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }

        totalSubArrays(arr);
    }
}