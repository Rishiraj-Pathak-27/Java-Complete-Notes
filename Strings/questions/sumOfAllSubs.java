// Sum of all substrings of a number

import java.util.Scanner;
public class sumOfAllSubs {
    public static int sumSubs(String s){
        int n=s.length();
        int sum=0;


        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                // converting the string res into Integer and storing it in the sum variable
                sum+=Integer.parseInt(s.substring(i,j));
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String s = ip.nextLine();

        System.out.println(sumSubs(s));
    }
}
