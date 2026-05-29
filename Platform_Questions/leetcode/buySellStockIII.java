// 23. Best Time to Buy and Sell Stock III

public class buySellStockIII{

    public static int bestTimeToSellAndBuy(int[] arr){
        int n=arr.length;
        int buyOne=Integer.MAX_VALUE;
        int sellOne = 0;
        int buyTwo = Integer.MAX_VALUE;
        int sellTwo=0;

        for(int ele:arr){
            
            // this will give the first min buy value day
            buyOne = Math.min(buyOne,ele);

            // this will give the max sell value day
            sellOne = Math.max(sellOne,ele-buyOne);

            // after selling 1st buy, this buyTwo will give the 2nd best min buy day            
            buyTwo = Math.min(buyTwo, ele-sellOne);

            //after sell of buyOne it will give the max value of the day after buyTwo
            sellTwo = Math.max(sellTwo, ele-buyTwo);
        }
        // sellTwo has the ans of the total profit after buy sell one & buy sell 2
        return sellTwo;
    }

    public static void main(String[] args){
        int[] arr = {3,3,5,0,0,3,1,4};

        System.out.println(bestTimeToSellAndBuy(arr));
    }
}