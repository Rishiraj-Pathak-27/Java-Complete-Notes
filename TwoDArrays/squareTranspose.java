// WAP to print the transpose of the square matrix

public class squareTranspose {
    public static void print(int[][] arr){
        for(int[] a : arr){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    public static void transposeArray(int[][] arr){
        int n=arr.length;

        print(arr);

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            System.out.println();
        }

        print(arr);

    }
    public static void main(String[] args){
        int[][] arr = {{1,2,8,9}, {4,6,0,1}, {5,0,3,4}, {9,2,7,8}};

        transposeArray(arr);
    }   
}
