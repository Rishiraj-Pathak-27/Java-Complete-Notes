// Copy one array into another

// public class arrayCopy {

//     public static void copy(int[] arr, int copy[]) {
        
//         int n = arr.length;
//         System.out.print("Original Array = ");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();

//         System.out.print("Copied Array = ");
//         for (int i = 0; i < n; i++) {
//             copy[i] = arr[i];
//             System.out.print(copy[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[] arr = {3, 5, 7, 9, 11, 13, 17};
//         int n = arr.length;
//         int[] copy = new int[n];

//         copy(arr,copy);
       
//     }
// }

// OR

// Copy one array into another

import java.util.Arrays;
public class arrayCopy {

    public static void copy(int[] arr) {
        int n = arr.length;
        System.out.print("Original Array = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Copied Array = ");
        for (int i = 0; i < n; i++) {
            int copy[] = Arrays.copyOf(arr, n);    // we can also use the Arrays.copyOf() method to make a deep copy of the original Array
            System.out.print(copy[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 17};
        copy(arr);
       
    }
}