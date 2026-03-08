// There are few ways using which we can traverse and print the array using for each loop

// 1.

// Here every arr[i] is the element present in the 1D array

// public class forEachLoop{
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

//         for(int i=0; i<arr.length; i++){        // complete 1D array inside 2D array
//             for(int ele : arr[i]){              // inner elements -> int ele : every element in 1D array
//                 System.out.print(ele+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// 2.

public class forEachLoop{
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int[] a : arr){
            for(int b : a){
                System.out.print(b +" ");
            }
            System.out.println();
        }
    }
}
