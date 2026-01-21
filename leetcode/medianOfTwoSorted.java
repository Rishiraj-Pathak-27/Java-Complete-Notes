import java.util.Arrays;

public class medianOfTwoSorted {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;

        int numOne = nums1.length;
        int numTwo = nums2.length;

        int[] arr = new int[n];

        for(int i=0; i<numOne; i++) {
            arr[i] = nums1[i];
        } 

        for(int j=0; j<numTwo; j++) {
            arr[numOne + j] = nums2[j];
        }

        Arrays.sort(arr);

        if(n % 2 == 1) {
            return arr[n/2];
        } else {
            return arr[n/2-1]+arr[n/2]/2.0;
    }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {3,5,7};
        
        System.out.println("Median of 2 Sorted arrays = "+findMedianSortedArrays(nums1,nums2));
    }
}