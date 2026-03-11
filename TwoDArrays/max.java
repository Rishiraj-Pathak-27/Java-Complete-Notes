// Find maximum among all the values in a 2D array

public class max {
    public static int maxValue(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[][] arr = {{1,4,2,5},{7,3,8,2}, {9,3,2,1}};

        System.out.println("max value = "+maxValue(arr));
    }
}
