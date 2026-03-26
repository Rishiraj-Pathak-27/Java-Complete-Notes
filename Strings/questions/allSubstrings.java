// WAP to print all the Substrings


import java.util.Scanner;
public class allSubstrings {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = ip.nextLine();

        // outer loop to traverse through whole string i.e 0->n-1

        for(int i=0; i<s.length(); i++){ 

            // inner loop to traverse from i to end of the string
            for(int j=i+1; j<=s.length(); j++){

                System.out.print(s.substring(i,j)+" ");
                
            }
        }
    }    
}
