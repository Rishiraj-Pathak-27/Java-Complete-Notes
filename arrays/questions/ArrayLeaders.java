/* You are given an array arr of positive integers.
Your task is to find all the leaders in the array.
An element is considered a leader if it is greater than or equal to all elements to its right.
The rightmost element is always a leader. */

// Input: arr = [16, 17, 4, 3, 5, 2]
// Output: [17, 5, 2]

import java.util.*;
public class ArrayLeaders {
public static ArrayList<Integer> arrayLeader(ArrayList<Integer> arr){
           
    ArrayList<Integer> leaders = new ArrayList<>();

        int n=arr.size();
        if(n==0) return leaders;

        int rightMax=arr.get(n-1);
        leaders.add(rightMax);

        for(int i=n-2; i>=0; i--){
            if(arr.get(i) >= rightMax){
                rightMax = arr.get(i);
                leaders.add(rightMax);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(51);
        arr.add(87);
        
        ArrayList<Integer> res = arrayLeader(arr);
        System.out.println("Array Leaders = "+res);
    }
}
