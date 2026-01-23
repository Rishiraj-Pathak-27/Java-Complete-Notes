public class greaterThanX {
    public static void main(String[] args) {
        int[] arr = {3,15,26,47,89,90,100,210};
        int x = 47;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.println("Numbers Greater than x = "+arr[i]);
                count++;
            }
        }
        System.out.println("Total greater than x = "+count);
    }
}