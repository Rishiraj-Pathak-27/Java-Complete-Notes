// Find the Minimum Number in an Array

// public class min {

//     public static int minNum(int[] arr) {
//         int n = arr.length;
//         int min = arr[0];

//         for (int i = 0; i < n; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         return min;
//     }

//     public static void main(String[] args) {
//         int[] arr = {4, 2, 9, 1, 7};
//         System.out.println("Minimum Value from array = " + minNum(arr));
//     }
// }


// OR

public class min {

    public static int min(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++) {
            min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,2,-5};
        System.out.println("Minimum value = "+min(arr));
    }
}
