// 231. Power of Two

public class powerOfTwo{

    public static boolean power(int n){
        if(n<=0) return false;

        for(int i=0; i<150; i++){
            if(Math.pow(2,i) == n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int n=32;
        System.out.println(power(n));
    }
}