// Row Sum & Column Sum

import java.util.*;
public class rowColSum {

    public static void sum(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int[] rowSum = new int[n];

        
        for(int i=0; i<n; i++){
            int rSum = 0;
            for(int j=0; j<m; j++){
                rSum+=arr[i][j];
            }
            rowSum[i] = rSum;
        }

        int[] colSum = new int[m];

        for(int j=0; j<m; j++){
            int cSum=0;
            for(int i=0; i<n; i++){
                cSum+=arr[i][j];
            }
            colSum[j] = cSum;
        }
        
        System.out.println("Row Sum = "+Arrays.toString(rowSum));
        System.out.println("Col sum = "+Arrays.toString(colSum));

    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int row = ip.nextInt();
        int col = ip.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = ip.nextInt();
            }
        }

        sum(arr);
    }
}
