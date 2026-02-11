// Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers.
// The relative order of odd or even integers does not matter.
// Return any array that satisfies the condition.

import java.util.Scanner;
public class sortEvenOdd{
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] sortByParity(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if((arr[i] % 2 == 1) && (arr[j] % 2==0)){
                swap(arr,i,j);
                i++;
                j--;
            }

            if(arr[i] % 2==0){
                i++;
            }
            if(arr[j] % 2==1) {
                j--;   
            }
            
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=ip.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }
        sortByParity(arr);
        print(arr);
    }
}
