// WAP to return row having maximum number if even elements (return row with 1 indexing)

import java.util.Scanner;
public class rowWithmaximumEven {

    public static int maximumEven(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;

        int max=Integer.MIN_VALUE;

        // maxRow variable to store the max evenCount 
        int maxRow=-1;

        for(int i=0; i<n; i++){
            int evenCount=0;
            for(int j=0; j<m; j++){
                if(arr[i][j] % 2 == 0){
                    evenCount++;
                }
            }
            if(evenCount > max){
                max=evenCount;
                maxRow=i;
            }
        }
        return maxRow+1;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter rows and cols: ");
        int row=ip.nextInt();
        int col=ip.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter the elements: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = ip.nextInt();
            }
        }
    
        System.out.println();

        System.out.println("Row with maximum even numbers = "+maximumEven(arr));

    }
}
