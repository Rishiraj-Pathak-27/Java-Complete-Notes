import java.util.Arrays;

public class twoSum {
    public static int[] twoSum(int x, int[] arr) {

        int[] ans = new int[2];

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == x) {
                ans[0] = i;
                ans[1] = j; 
                return ans;
                }
            }
        }
            return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,2,6,7,1};
        int x = 9;
        

        System.out.println(Arrays.toString(twoSum(x, arr)));
    }
}