public class rotateColckwise {

    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }

    // step 1. transpose of a array
    public static void transpose(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }
    }

    // step 2. reverse every row from transposed array
    public static void rotate(int[][] arr) {

        transpose(arr);

        int n = arr.length;
        int m = arr.length;

        for (int i = 0; i < n; i++) {
            int left=0, right=m-1;

            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }

            System.out.println();
        }

        print(arr);

    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 8, 1, 4 }, { 7, 2, 3, 5 }, { 5, 5, 4, 6 }, { 3, 1, 8, 7 } };

        // step 1. transpose of a array
        // step 2. reverse every row from transposed array

        rotate(arr);
    }
}
