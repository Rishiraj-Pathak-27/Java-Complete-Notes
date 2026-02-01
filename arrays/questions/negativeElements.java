// Given an array, print negative elements only

public class negativeElements {
    public static void main(String[] args) {
        int[] arr = {2,-10,4,-15,9,-20,55,-25};

        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) System.out.print(arr[i]+" ");
        }
    }
}