import java.util.Scanner;

public class buySellStockTwo {
    public static int maxProfit(int[] arr){
        int n=arr.length;
        int max=0;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]){
                max = max + (arr[i]-arr[i-1]);
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter days: ");
        int n=ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter prices for each days: ");

        for(int i=0; i<n; i++){
            arr[i]=ip.nextInt();
        }

        System.out.println("Max profit for multi buy and multi sell = "+maxProfit(arr));


    }
}
