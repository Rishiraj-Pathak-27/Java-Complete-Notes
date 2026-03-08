// WAP to print the elements column wise

public class columnWisePrinting {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{2,5,8}};

        int n=arr.length;
        int m=arr[0].length;

        for(int j=0; j<m; j++){ // j -> 0 to 2
            for(int i=0; i<n; i++){  // i -> 0 to 3
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
