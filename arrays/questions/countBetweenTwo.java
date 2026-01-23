// Count Values Between Two Numbers

public class countBetweenTwo{
    public static int count(int[] arr, int low, int high){
        int n=arr.length;
        int count=0;
            for(int i=0; i<n; i++){
                if(arr[i] >= 7 && arr[i] <= 15){
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args){
            int[] arr = {5,12,7,18};
            int low = 5;
            int high = 7;
            
            System.out.printf("Numbers between \"%d\" & \"%d\" = %d",low,high,count(arr,low,high));
            System.out.println();            
    }
}