// 14. Longest Common Prefix

import java.util.Scanner;
import java.util.Arrays;
public class longestCommonPrefix{

    public static String longestPrefix(String[] str){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);

        int n=str.length;
        String left = str[0];
        String right = str[n-1];

        for(int i=0; i<Math.min(left.length(),right.length()); i++){
            if(left.charAt(i) != right.charAt(i)){
                return sb.toString();
            }
            sb.append(left.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the length of string array: ");
        int n=ip.nextInt();
        ip.nextLine();

        String[] str = new String[n];

        System.out.println("Enter string values: ");
        for(int i=0; i<n; i++){
            str[i]=ip.nextLine();
        }

        System.out.println("Longest Common Prefix = "+longestPrefix(str));
    }
}