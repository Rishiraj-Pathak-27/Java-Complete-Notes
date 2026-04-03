// Find the Difference between to Strings

import java.util.Scanner;
public class findTheDiff {
    public static char findDiff(String s, String t){
        char ch=0;

        for(char a:s.toCharArray()){
            ch = (char)(ch ^ a);
        }

        for(char b:t.toCharArray()){
            ch = (char)(ch ^ b);
        }
        return ch;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter 2 Strings: ");
        String s=ip.nextLine();
        String t=ip.nextLine();

        System.out.println("The different character = "+findDiff(s,t));
    }
}
