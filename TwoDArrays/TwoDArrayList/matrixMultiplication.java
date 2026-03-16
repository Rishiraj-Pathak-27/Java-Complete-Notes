// WAP to perform matrix multiplication using arraylist

import java.util.*;
public class matrixMultiplication {

    public static ArrayList<ArrayList<Integer>> matrixMul(int[][] arr1, int[][] arr2){
        int n=arr1.length;
        int m=arr2[0].length;
        int l=arr1[0].length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            ArrayList<Integer> res = new ArrayList<>();

            for(int j=0; j<m; j++){
                int sum=0;

                for(int k=0; k<l; k++){
                    sum+=arr1[i][k] * arr2[k][j];  
                }
                res.add(sum);
            }
            ans.add(res);
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int rows=ip.nextInt();
        int cols=ip.nextInt();

        int[][] arr1 = new int[rows][cols];

        System.out.println("Enter elements for matrix 1: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr1[i][j] = ip.nextInt();
            }
        }

        int[][] arr2 = new int[rows][cols];

        System.out.println("Enter elements for matrix 2: ");

         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr2[i][j] = ip.nextInt();
            }
        }


        System.out.println(matrixMul(arr1,arr2));
    }
}
