public class minOutOfmax {
    public static void minValue(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int row=-1;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++){
                if(arr[i][j] > max){
                    max=arr[i][j];
                }
            }

            if(max<min){
                min=max;
                row=i;
            }
        }
        System.out.println(min+" "+row);
    }
    
    public static void main(String[] args){
        int[][] arr = {{4,9,3,2},{1,6,3,1},{2,2,5,4}};

        minValue(arr);
    }
}
