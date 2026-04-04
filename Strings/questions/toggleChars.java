// Given a string, the task is to toggle all the characters of the string i.e to convert Upper case to Lower case and vice versa.

// import java.util.Scanner;
// public class toggleChars {

//     public static StringBuilder toggling(StringBuilder str){
//         int n=str.length();

//         for(int i=0; i<n; i++){
//             boolean flag = true;    // init capital letters
//             char ch = str.charAt(i);
//             int ascii = (int)ch;

//             if(ascii >= 97){  // small letters
//                 flag=false;
//             }

//             if(ch==' ') continue;
            
//             if(ch>='0' && ch<='9') continue;

//             if(flag){
//                 ascii += 32;
//                 char dh = (char)ascii;
//                 str.setCharAt(i, dh);
//             }else{
//                 ascii -= 32;
//                 char dh = (char)ascii;
//                 str.setCharAt(i, dh);
//             }
//         }
//         return str;
//     }

//     public static void main(String[] args){
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the string: ");

//         StringBuilder str = new StringBuilder(ip.nextLine());

//         System.out.println(toggling(str));
//     }
// }


// OR (Using string -> But poor performance)

public class toggleChars{

    public static void toggling(String str){
        int n=str.length();

        System.out.println(str);

        for(int i=0; i<n; i++){
            boolean flag = true;
            char ch = str.charAt(i);

            if(ch == ' ') continue;
            if(ch>='0' && ch<='9') continue;

            int ascii = (int)ch;

            if(ascii >= 97){
                flag = false;
            }

            if(flag){
                ascii += 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }else{
                ascii -= 32;
                char dh = (char)ascii;
                str = str.substring(0,i)+ dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args){
        String str = "rIsHIrAj";
        toggling(str);
    }
}