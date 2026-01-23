// Create a new array that stores only the squares of even numbers from the original array.

import java.util.Arrays;
public class evenSquare {

    public static int[] square(int[] arr) {
        int n = arr.length;
        int count = 0;

        // first count the even numbers        
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }

        // find square of them
        int[] square = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                square[index] = arr[i] * arr[i];
                index++;
            }
        }
        return square;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Squared Array = "+Arrays.toString(square(arr)));
    }
}
