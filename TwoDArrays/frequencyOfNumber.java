// Count Frequency of a Number

public class frequencyOfNumber {

    public static int frequency(int[][] arr, int target){
        int count=0;
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[][] arr = {{1,2,3,4}, {2,3,4,5}, {2,1,5,0}};
        int target=1;

        System.out.format("Frequency of %d is = %d",target, frequency(arr,target));

        
    }    
}
