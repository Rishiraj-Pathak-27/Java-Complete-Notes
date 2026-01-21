import java.util.Arrays;
public class twoSum {
    
    public static int[] twoSum(int x, int[] arr) {
        int[] ans = new int[2];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++) {
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
        int[] arr = {45,21,45,24,21,90};
        int x = 111;

        System.out.println(Arrays.toString(twoSum(x, arr)));
    }
}