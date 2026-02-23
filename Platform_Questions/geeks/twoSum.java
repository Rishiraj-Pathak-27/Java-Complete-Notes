import java.util.Arrays;

public class twoSum {
    public static boolean twoSumTarget(int[] arr, int target){
        Arrays.sort(arr);
        int n=arr.length;
        int i=0, j=n-1;

        while(i<j){
            if(arr[i] + arr[j] == target) return true;

            if(arr[i] + arr[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    
    }
    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        System.out.println(twoSumTarget(arr,target));
    }
}
