// WAP to count vowels from a string

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
        String str = "Rishiraj";

        System.out.printf("There are %d vowels in string %s", vowels(str), str);
    }
}
