// Write a method isPalindrome(String s) to check if a string is a palindrome.

import java.util.Scanner;
public class palindromicString {
    
    public static void isPalindrome(String s) {
        
        int start = 0;
        int end = s.length() - 1;

        for(int i = start; i <= end; i++) {
            if(s.charAt(start) != s.charAt(end)) {
                start++;
                end--;
            } else {
                System.out.printf("%s is a Palindromic String",s);
                return;
            }
        }
        System.out.printf("%s is not a Palindromic String",s);

    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = ip.nextLine();
        isPalindrome(str);
    }
}