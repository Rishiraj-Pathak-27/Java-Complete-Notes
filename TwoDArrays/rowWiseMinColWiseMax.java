// Problem:

// Find minimum element in each row
// Find maximum element in each column

import java.util.Arrays;

public class rowWiseMinColWiseMax{

    public static int[] minRow(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int[] row = new int[n];

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<m; j++){
                if(arr[i][j] < min){
                    min=arr[i][j];
                }
            }
            row[i] = min;
        }  
        return row;
    }

    public static int[] maxCol(int[][] arr){

        int n=arr.length;
        int m=arr[0].length;

        int[] col = new int[m];

        for(int j=0; j<m; j++){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                if(arr[i][j] > max){
                    max=arr[i][j];
                }
            }
            col[j] = max;
        }
        return col;
    }


    public static void main(String[] args){
        int[][] arr = {{-1,-2,-3},{-4,-5,-6},{-7,-8,-9}};
        int[] min = minRow(arr);
        int[] max = maxCol(arr);
        System.out.println("Min From Rows = "+Arrays.toString(min));
        System.out.println("Max From Cols = "+Arrays.toString(max));
    }
}