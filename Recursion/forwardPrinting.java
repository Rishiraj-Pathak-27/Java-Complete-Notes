import java.util.Scanner;

public class forwardPrinting {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int end=ip.nextInt();
        int start=1;
        print(start,end);
    }    

    public static void print(int start, int end){
        if(start>end) return;
        System.out.println(start);
        print(start+1,end);
    }
}
