// WAP to return the total number of palindromic substrings
// (647. Palindromic Substrings)

import java.util.Scanner;
public class palindromicSubStrings {

    // function to check if a substr is palindrome or not
    public static boolean isPalindrome(String str){
        int n=str.length();
        int left=0, right=n-1;

        while(left<right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }

    // function to find out all the substrs and call the isPalindrome() function to check if the substr is palindrome or not
    public static void palindromeSubStr(String str){
        int n=str.length();
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                if(isPalindrome(str.substring(i,j)) == true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\nTotal palindromic substrings are = "+count);
    }


    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = ip.nextLine();

        palindromeSubStr(str);
    }
}
