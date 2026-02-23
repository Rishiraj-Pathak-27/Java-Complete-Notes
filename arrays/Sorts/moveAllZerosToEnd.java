// WAP to move all the zeros to the end without changing their order.

import java.util.Arrays;

public class moveAllZerosToEnd{
    public static int[] moveZeros(int[] arr){
        int j=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int[] res = moveZeros(arr);
        System.out.println(Arrays.toString(res));
    }
}


// OR

// import java.util.ArrayList;
// public class moveAllZerosToEnd {
//     public static void zerosAtEnd(int[] arr){
//         ArrayList<Integer> res = new ArrayList<>();
        
//         for(int ele : arr){
//             if(ele!=0){
//                 res.add(ele);
//             }
//         }
//         for(int ele : arr){
//             if(ele==0){
//                 res.add(ele);
//             }
//         }
//         System.out.println(res);
//     }
//     public static void main(String[] args){
//         int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
//         zerosAtEnd(arr);
//     }
// }
