// Find the Missing Number in an array

public class missingNumber {
    public static int missing(int[] arr){
        int n=arr.length + 1;  // length + 1 numbers will be present in the array 

        // using sum of series formula = n(n+1)/2 & sum of nums in array
        
        int sumOfSeries = (n*(n+1))/2;
        int sumOfNums = 0;
        
        for(int ele : arr){
            sumOfNums+=ele;
        }
        return sumOfSeries - sumOfNums;
    }

    public static void main(String[] args) {
        int[] arr = {8,2,4,5,3,7,1};
        System.out.println("Missing Number in array = "+missing(arr));
    }
}