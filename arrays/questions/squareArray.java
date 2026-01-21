// Create a New Array with Squares of Each Element

public class squareArray {
    
    public static void elementSquare(int[] arr) {
        int n = arr.length;
        int square[] = new int[n];

        System.out.print("Original Array = ");

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Squared Array = ");
        for(int i = 0; i < n; i++) {
            square[i] = arr[i] * arr[i];
            System.out.print(square[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        elementSquare(arr);
    }
}