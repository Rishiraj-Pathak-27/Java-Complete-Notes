// Search for a given element (linear search)

import java.util.Scanner;
public class elementSearch {
    
    public static void eleSearch(int[] arr, int target) {
        boolean found = false;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                found = true;
                System.out.println("Element found at index = "+i);
                break;
            }
        }
        if(!found) {
            System.out.println("Element Not found");
        }
    }
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int n = ip.nextInt();
        System.out.println();
        
        int[] arr = new int[n]; 

        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = ip.nextInt();
        }   
        System.out.println();

        System.out.print("Enter target value: ");
        int target = ip.nextInt();
        eleSearch(arr,target);
    }
}