// Search for a given number using linear search.

import java.util.Scanner;
public class linearSearch {
    public static int search(int[] arr,int target){
        int n=arr.length;
        boolean isFound = false;

        for(int i=0; i<n; i++){
            if(arr[i]==target){
                isFound=true;
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Define Array Elements: ");
        int n=ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = ip.nextInt();

        System.out.println("Element found at index = "+search(arr,target));


    }
}
