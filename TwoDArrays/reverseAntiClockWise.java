public class reverseAntiClockWise {

    public static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }


    // 1) transpose of the array

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
        print(arr);
    }

    // 2) reverse the columns to get the array rotated by 90 deg anticlockwise 

    public static void rotate(int[][] arr) {
        int n=arr.length;
        int m = arr[0].length;

        for (int j = 0; j < n; j++) {
            int up = 0, down = m - 1;

            while (up < down) {
                int temp = arr[up][j];
                arr[up][j] = arr[down][j];
                arr[down][j] = temp;
                up++;
                down--;
            }
            System.out.println();
        }

        print(arr);
    }

    public static void main(String[] args) {
        int[][] arr = { { 2, 8, 3, 4 }, { 7, 2, 1, 6 }, { 5, 5, 4, 1 }, { 3, 1, 8, 2 } };

        transpose(arr);
        rotate(arr);

    }
}
