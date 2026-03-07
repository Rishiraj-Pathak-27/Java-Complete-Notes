// WAP to find the row having maximum sum

public class maxSumRow {
    public static void maxRow(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int max = Integer.MIN_VALUE;
        int row=-1;

        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<m; j++){
                sum+=arr[i][j];
            }

            if(sum>max){
                max=sum;
                row=i;
            }
        }
        System.out.print("Max Sum = "+max+" & Row = "+row);
    }

    public static void main(String[] args){
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,5,4,1,4},{9,1,8,2,6}};

        maxRow(arr);
    }
}
