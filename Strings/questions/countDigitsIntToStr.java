// count digits Int to String

import java.util.Scanner;
public class countDigitsIntToStr {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=ip.nextInt();

        String s = "" + n;
        System.out.println(s.length());
    }
}


// In the output it will not count the leading 0 but count trailing 0
