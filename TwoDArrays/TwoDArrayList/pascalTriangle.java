// WAP to print the pascal triangle

import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriangle {
    public static ArrayList<ArrayList<Integer>> pascals(int n){
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            res.add(new ArrayList<>());

            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    res.get(i).add(1);
                }else{
                    int val = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    res.get(i).add(val);
                }
            }
        }

        return res;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();

        ArrayList<ArrayList<Integer>> triangle = pascals(n);
        System.out.println(triangle);
        
    }
}
