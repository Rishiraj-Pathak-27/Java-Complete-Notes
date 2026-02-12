// Given an integer array 'a' sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.

import java.util.Scanner;

public class squares {
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int[] NonDecreasingSquare(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i = 0;
        int j = n - 1;
        int k = 0;

        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k++] = (int) (Math.pow(arr[i++], 2));
            }

            else {
                ans[k++] = (int) (Math.pow(arr[j--], 2));
            }

        }
        return ans;
    }

    public static int[] reverse(int[] ans){
        int n=ans.length; 
        int i=0;
        int j=n-1;

        while(i<j){
            swap(ans,i,j);
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        print(arr);
        int[] squaredArray = NonDecreasingSquare(arr);
        int[] res = reverse(squaredArray);
        print(res);

    }
}