// Write an algorithm to sort an array using selection sort
// The selection sort is a technique which is used to sort an array in either ascensing or descending order
// In this sort we are required to select the min element from an array and place it at the min idx position at every pass

import java.util.Scanner;

public class selectionSort {
    public static void print(int[] arr){
        for(int ele : arr){

        System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void selectionSortFunction(int[] arr){
        int n=arr.length;
        System.out.print("Before Sort: ");
        print(arr);
        for(int i=0; i<n-1; i++){
            int min=Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=i; j<n; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp; 
        }
        System.out.print("After Sort: ");
        print(arr);
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size = ");
        int n=ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements = ");
        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }
        selectionSortFunction(arr);
    }

}

