import java.util.Arrays;
public class mergeSortedArrays {
    public static int[] sortedMerger(int[] nums1, int[] nums2) {
        int arrOne = nums1.length;
        int arrTwo = nums2.length;

        int[] merger = new int[arrOne + arrTwo];

        for(int i=0; i<arrOne; i++) {
            merger[i] = nums1[i];
        }

        for(int j=0; j<arrTwo; j++) {
            merger[arrOne + j] = nums2[j];
        }

        return merger;
    }

    public static void main(String []args) {
        int[] arr1 = {4,6,3};
        int[] arr2 = {43,24,1};

        int[] res = sortedMerger(arr1,arr2);
        Arrays.sort(res);        

        System.out.println("Merged Sorted Arrays = "+Arrays.toString(res));
    }
}