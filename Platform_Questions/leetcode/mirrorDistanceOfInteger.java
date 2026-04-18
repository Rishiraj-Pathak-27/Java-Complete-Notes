public class mirrorDistanceOfInteger {
    public static int mirrorDistance(int n) {
        int reverse = 0;

        int copy = n;

        while (n != 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n /= 10;
        }

        int res = Math.abs(copy - reverse);

        return res;

    }

    public static void main(String[] args){
        int n = 52;

        System.out.println(mirrorDistance(n));
    }
}