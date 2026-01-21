// WAP to merge 2 arrays

import java.util.Arrays;
public class mergeArrays{
    public static int[] arrayMerger(int[] nums1, int[] nums2) {
        int arrOne = nums1.length;
        int arrTwo = nums2.length;

        int[] merged = new int[arrOne + arrTwo];

        for(int i=0; i<arrOne; i++) {
            merged[i] = nums1[i];
        }

        for(int j=0; j<arrTwo; j++) {
            merged[arrOne + j] = nums2[j];
        }

       return merged;        
    }

    public static void main(String []args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {10,20,30};

        int[] res1 = arrayMerger(arr1,arr2);

        System.out.println("Merged Arrays = "+Arrays.toString(res1));
    }
}