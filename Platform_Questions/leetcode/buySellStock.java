// Best Time to Buy and Sell Stock

public class buySellStock {
    public static int maxProfit(int[] arr){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];     // min=7, min=1 , when min=5 try selling min=1
            }else{
                int profit=arr[i]-min;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
