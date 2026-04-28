// 151. Reverse Words in a String

import java.util.Scanner;

public class reverseWords {

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        // remove whitespaces from front and end of the string
        
        s = s.trim();

        // split the complete string using regex where \\s will be used to remove the white spaces from the string and + will check the occurrances of the white spaces and check with its posterior whitespace if got 2 occurrances then it will keep only 1.
        // in short make the string clean with one white space in between each word, always get stored in a string array 
        String[] words = s.split("\\s+");

        int n=words.length;

        for(int i=n-1; i>=0; i--){
           sb.append(words[i]);
           
           // to avoid the last blank space
           if(i>0){
            sb.append(" ");
           }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = ip.nextLine();

        System.out.println(reverse(s));
    }
}
