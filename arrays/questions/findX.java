// WAP to find 'x' in array

import java.util.Scanner;
public class findX {
    public static void main(String[] args) {

        // taking input
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();

        int[] arr = new int[n];
        int x = 45;     // target value 
        System.out.println("Enter array elements: ");

        for(int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        // finding 'x' and printing it
        boolean found = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x) {
                found = true;
                System.out.println("Found at location = "+i);
                break;
            } 
        }
            if(found == false) {
                System.out.println("Not found");
            }
    }
}




// WAP to find 'x' in array using function

/* import java.util.Scanner;
public class findX {
    
    public static boolean xElement(int n[], int x) {
        x = 45;
        for(int i = 0; i < n.length; i++) {
            if(n[i] == x) {
                return true;
            }
        }
            return false;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = ip.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array Elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        System.out.println(xElement(arr, n));
    }
} */