
import java.util.Scanner;
public class toggleChars {

    public static StringBuilder toggling(StringBuilder str){
        int n=str.length();

        for(int i=0; i<n; i++){
            boolean flag = true;    // init capital letters
            char ch = str.charAt(i);
            int ascii = (int)ch;

            if(ascii >= 97){  // small letters
                flag=false;
            }

            if(ch==' ') continue;

            if(flag){
                ascii += 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }else{
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }
        }
        return str;
    }

    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the string: ");

        StringBuilder str = new StringBuilder(ip.nextLine());

        System.out.println(toggling(str));
    }
}
