// Check if an Array is Sorted (Non-Decreasing Order)

public class arraySorted {
    public static boolean isSorted(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,100};
        System.out.println("Sorted = "+isSorted(arr));
    }
}