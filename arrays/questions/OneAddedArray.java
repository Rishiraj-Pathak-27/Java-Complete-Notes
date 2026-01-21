// Create a New Array by Adding 1 to Each Element

import java.util.*;
public class OneAddedArray {
    public static int[] oneAdded(int[] arr){
        int n=arr.length;
        int[] oneAdd = new int[n];

        for(int i=0; i<n; i++){
            arr[i]+=1;
            oneAdd[i] = arr[i];
        }
        return oneAdd;
    }

    public static void main(String[] args){
        int[] arr = {23,34,54,12};
        int[] res = oneAdded(arr);
        System.out.println(Arrays.toString(res));
    }
}
