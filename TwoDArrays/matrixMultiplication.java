// WAP to perform matrix multiplication 

public class matrixMultiplication {
    public static void main(String[] args){
        int[][] arr1 =  {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{9,6,3},{8,5,2},{7,4,1}};

        int[][] result = new int[arr1.length][arr2[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2[0].length; j++){
                result[i][j] = arr1[i][j] * arr2[i][j];
            }
            System.out.println();
        }

        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
