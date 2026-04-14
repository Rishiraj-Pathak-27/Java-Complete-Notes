// 345. Reverse Vowels of a String

public class reverseVowelsString {

    public static String reversedVowels(String s) {
        char[] arr = s.toCharArray();

        int n = arr.length;

        int left = 0, right = n - 1;

        while (left < right) {
            if ((arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o' || arr[left] == 'u'
                    || arr[left] == 'A' || arr[left] == 'E' || arr[left] == 'I' || arr[left] == 'O' || arr[left] == 'U')
                    && (arr[right] == 'a' || arr[right] == 'e' || arr[right] == 'i' || arr[right] == 'o'
                            || arr[right] == 'u' || arr[right] == 'A' || arr[right] == 'E' || arr[right] == 'I'
                            || arr[right] == 'O' || arr[right] == 'U')) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (!(arr[left] == 'a' || arr[left] == 'e' || arr[left] == 'i' || arr[left] == 'o'
                    || arr[left] == 'u' || arr[left] == 'A' || arr[left] == 'E' || arr[left] == 'I' || arr[left] == 'O'
                    || arr[left] == 'U')) {
                        left++;
            }else{
                right--;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "IceCreAm";

        System.out.println(reversedVowels(s));
    }
}
