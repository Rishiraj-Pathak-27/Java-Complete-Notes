// Create a method countVowels(String s) that returns the number of vowels.

import java.util.Scanner;
public class vowelCount {
    public static int countVowels(String s) {
        int start = 0;
        int end = s.length();
        int count = 0;
        
        
        for(int i = start; i < end; i++) {
           switch(Character.toLowerCase(s.charAt(i)) ) {
            case 'a':
            case'e':
            case'i':
            case'o':
            case'u':
            count++;
            break;

            default :
            break;
           }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = ip.nextLine();
        System.out.println("Vowel count = "+countVowels(str));
    }

}