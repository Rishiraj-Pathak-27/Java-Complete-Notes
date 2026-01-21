import java.util.Arrays;

public class oddSquare {
    
    public static int[] oddSquare(int[] arr) {
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(i % 2 != 0) {
                count++;
            }
        }

        int result[] = new int[count];
        int index = 0;

        for(int i=0; i<n; i++) {
            if(i % 2 != 0){

                result[index] = arr[index] * arr[index];
                index++;
            }
        }

        return result;
    }
    
    public static void main(String []args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int res[] = oddSquare(arr);
        System.out.println(Arrays.toString(res));

    }
}