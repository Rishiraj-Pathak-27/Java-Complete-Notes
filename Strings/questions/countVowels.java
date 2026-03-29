// WAP to count vowels from a string

import java.util.Scanner;
public class countVowels {
    public static int vowels(String str) {
        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = ip.nextLine();

        System.out.printf("There are %d vowels in string %s\n", vowels(str), str);
    }
}
