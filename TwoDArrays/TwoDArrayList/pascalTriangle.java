// WAP to print the pascal triangle

/* import java.util.ArrayList;
import java.util.Scanner;

public class pascalTriangle {
    public static ArrayList<ArrayList<Integer>> pascals(int n){
        
        // main 2D arraylist is created to store the pascal triangle
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();


        // outer loop to traverse through the rows
        for(int i=0; i<n; i++){

            // arraylist to store the elements
            ArrayList<Integer> ans = new ArrayList<>();

            // inner loop to traverse through elements
            for(int j=0; j<=i; j++){
                // if j==0 || j==i add 1 to the borders
                if(j==0 || j==i){
                    ans.add(1);
                }else{
                    // else add the addition of prev numbers to it i.e ( res[i-1][j]+res[i-1][j-1] )
                    int val = res.get(i-1).get(j) + res.get(i-1).get(j-1);
                    ans.add(val);
                }
            }

            // array added to 2D arraylist
            res.add(ans);
        }

        return res;
    }
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter pascal triangle length = ");
        int n=ip.nextInt();

        ArrayList<ArrayList<Integer>> triangle = pascals(n);
        System.out.println(triangle);
        
    }
} */


// OR (Two different loops)

import java.util.*;

public class pascalTriangle{
    public static List<List<Integer>> pascals(int n){

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            List<Integer> res = new ArrayList<>();

            for(int j=0; j<=i; j++){
                res.add(1);
            }

            ans.add(res);
        }


        for(int i=0 ; i<n; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    ans.get(i).set(j,1);
                }else{
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).set(j,val);
                }
            }
        }
        return ans;

    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int n=ip.nextInt();
        
        List<List<Integer>> result = pascals(n);
        System.out.println(result);
    }
}

