public class missingNumber {
    public static int missNum(int[] nums) {
        int n=nums.length;
        int sumOfSeries=(n*(n+1))/2;
        int sumOfElements=0;

        for(int ele:nums){
            sumOfElements+=ele;
        }
        return sumOfSeries - sumOfElements;       
    }

    public static void main(String[] args){
        int[] arr = {0,1,2,3,5};
        System.out.println(missNum(arr));
    }
}