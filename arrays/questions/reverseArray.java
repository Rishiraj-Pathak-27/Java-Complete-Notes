// Reverse Array through 2 pointers (Swapping)

/* public class reverseArray {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void partReverse(int[] arr) {
        
    }

    public static void main(String[] args) {
        int[] arr = {32, 54, 56, 21, 1, 10, 44};
        print(arr);
        System.out.println();
        int k = 2;
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

        print(arr);
        

    }
} */


// using for each loop

import java.util.*;
public class reverseArray {
    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void swap(int i, int j, int[] arr) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }

    public static int[] reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while(i<j) {
            swap(i,j,arr);
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String []args) {
        int[] arr = {3,2,4,5,6,2,1,3};
        print(arr);
        int[] res = reverse(arr);
        System.out.println(Arrays.toString(res));
    }
}
