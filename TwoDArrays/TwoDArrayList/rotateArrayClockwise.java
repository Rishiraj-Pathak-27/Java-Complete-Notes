import java.util.ArrayList;
import java.util.Scanner;

public class rotateArrayClockwise {

    public static void print(ArrayList<ArrayList<Integer>> res){
        for(int i=0; i<res.size(); i++){
            for(int j=0; j<res.get(i).size(); j++){
                System.out.print(res.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void transpose(ArrayList<ArrayList<Integer>> res){
        int n=res.size();

        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = res.get(i).get(j);
                res.get(i).set(j, res.get(j).get(i));
                res.get(j).set(i, temp);
            }
            System.out.println();
        }
    }

    public static void rotate(ArrayList<ArrayList<Integer>> res){
            int n=res.size();

            transpose(res);

            for(int i=0; i<n; i++){
                int left=0, right=n-1;

                while(left<right){
                    int temp = res.get(i).get(left);
                    res.get(i).set(left, res.get(i).get(right));
                    res.get(i).set(right, temp);
                    left++;
                    right--;
                }
                System.out.println();
            }
            print(res);
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Enter the size of array: ");
        int n=ip.nextInt();

        ArrayList<ArrayList<Integer>> res  = new ArrayList<>();

        System.out.println("Enter Elements:");
        for(int i=0; i<n; i++){
            ArrayList<Integer> list = new ArrayList<>();

            for(int j=0; j<n; j++){
                list.add(ip.nextInt());
            }

            res.add(list);
        }

        System.out.println();
        print(res);
        System.out.println("\nRotated Array:");
        rotate(res);
    }
}
