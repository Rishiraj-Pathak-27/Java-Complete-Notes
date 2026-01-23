// Remove all even numbers from the collection.

import java.util.ArrayList;
public class evenRemover{
    public static ArrayList<Integer> evenRemover(ArrayList<Integer> arr){
        int n=arr.size();
        ArrayList<Integer> even = new ArrayList<>();
      
        for(int i=0; i<n; i++){
            if(arr.get(i) % 2 != 0){
                even.add(arr.get(i));
            }
        }
        return even;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        ArrayList<Integer> res = evenRemover(arr);
        System.out.println(res);
    }
}