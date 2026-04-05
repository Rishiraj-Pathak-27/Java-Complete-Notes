// WAP to check is 2 strings are anagrams or not

import java.util.Scanner;
import java.util.Arrays;
public class validAnagrams {

    public static boolean anagrams(String s1, String s2){
        int n=s1.length();
        int m=s2.length();

        if(n!=m) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }


    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String s1 = ip.nextLine();
        String s2 = ip.nextLine();

        System.out.println("Is Anagram = "+anagrams(s1,s2));
    }
}
