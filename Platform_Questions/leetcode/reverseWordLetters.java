// WAP to reverse each word in string

// public class reverseWords {

//     // function to perform reverse operation word by word
//     public static String reverse(String str){
        
//         char[] arr = str.toCharArray();
//         int n=arr.length;
//         int left=0, right=n-1;

//         while(left<right){
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }

//         return new String(arr);
//     }

//     // function used to detec the spaces and if found reverse the word and go ahead
//     public static String wordReverse(String str){
//         int n=str.length();

//         String ans = ""; // ans used to store the reversed word string
//         StringBuilder sb = new StringBuilder(""); // empty string builder to store the original string words until space founds

//         for(int i=0; i<n; i++){
//             char ch = str.charAt(i);
            
//             // if char does not found space then append the char to sb
//             if(ch != ' '){
//                 sb.append(ch);
//             }else{      // if space found then reverse the word in sb and put it into the ans and then re initialize the sb

//                 ans += reverse(sb.toString());
//                 ans += " ";
//                 sb = new StringBuilder("");
//             }
//         }

//         // this is for the last word bcoz if there are n words then the spaces are n-1
//         ans += reverse(sb.toString());
//         return ans;
//     }
//     public static void main(String[] args){
//         String str = "My name is John";

//         System.out.println(wordReverse(str));
//     }
// }


// Approach 2 (using reverse() built in method from string builder)

public class reverseWordLetters{

    public static String wordReverse(String str){
        int n=str.length();

        StringBuilder sb = new StringBuilder();
        String ans = "";

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder();
            }
        }
        ans += sb.reverse();
        return ans;
    }

    public static void main(String[] args){
        String str = "I like to Play Cricket";

        System.out.println(wordReverse(str));
    }
}