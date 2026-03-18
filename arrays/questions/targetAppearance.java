// Count How Many Times a Target Appears

public class targetAppearance{
    public static int count(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2,5,2};
        int target = 2;

        System.out.printf("Target Appears \"%d\" times",count(arr,target));
    }
}