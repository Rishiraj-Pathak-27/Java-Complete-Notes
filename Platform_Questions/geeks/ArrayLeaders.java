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
