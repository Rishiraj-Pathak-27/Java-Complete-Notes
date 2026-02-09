// WAP to check every query entered by the user based on the frequency, if present 'YES' else 'NO'

import java.util.Scanner;

public class presentQuery{
    
    public static int[] queryCheck(int[] arr){
        int n=arr.length;
        int[] freq = new int[100005];

        for(int i=0; i<n; i++){
            freq[arr[i]++] = arr[i];
        }
        return freq;
    }       
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = ip.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = ip.nextInt();
        }

        System.out.println("Define the number of queries you want to ask: ");
        int queries = ip.nextInt();

        int[] freq = queryCheck(arr);

        while(queries>0){
            System.out.println("Enter the query you want to search: ");
            int x = ip.nextInt();

            if(freq[x]>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            queries--;
        }
    }
}