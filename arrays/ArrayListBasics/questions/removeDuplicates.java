// Remove duplicate elements from an ArrayList.
// Input: [1, 2, 2, 3, 4, 4, 5]
// Output: [1, 2, 3, 4, 5]

import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates{

    public static void removeDuplicates(ArrayList<Integer> arr){
       
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                    j--;
                }
            }
        }
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
        
        removeDuplicates(arr);
        System.out.println(arr);

    } 
}
