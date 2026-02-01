// Find All Elements Greater Than Average

import java.util.Scanner;
import java.util.ArrayList;
public class greaterThanAverage {
    public static ArrayList<Integer> greater(ArrayList<Integer> arr){
        int n=arr.size();
        int sumOfElements = 0;

        ArrayList<Integer> greater = new ArrayList<>();

        for(int i=0; i<n; i++){
            sumOfElements+=arr.get(i);
        }
        double avg = (double)sumOfElements/n;

        for(int i=0; i<n; i++){
            if(arr.get(i)>avg){
            greater.add(arr.get(i));
            }
        }
        return greater;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Define array size: ");
        int n=ip.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        
        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            arr.add(ip.nextInt());
        }

        System.out.println(greater(arr));

    }
}
