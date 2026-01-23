// Find the maximum and minimum element in an ArrayList.

import java.util.List;   // List is an interface which contains ArrayList Class
import java.util.ArrayList;
import java.util.Scanner;
public class minMax{
    public static int min(List<Integer> arr){
        int n=arr.size();
        int min=Integer.MAX_VALUE;

        for(int ele:arr){
            if(ele<min){
                min=ele;
            }
        }
        return min;
    }
    public static int max(List<Integer> arr){
        int n=arr.size();
        int max=Integer.MIN_VALUE;
        for(int ele:arr){
            if(ele>max){
                max=ele;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Define array size: ");
        int n=ip.nextInt();

        List<Integer> arr = new ArrayList<>();
        
        System.out.println("Define array elements: ");
        for(int i=0; i<n; i++){
            arr.add(ip.nextInt());
        }

        System.out.println("Min value = "+min(arr));
        System.out.println("Max value = "+max(arr));
    }
}