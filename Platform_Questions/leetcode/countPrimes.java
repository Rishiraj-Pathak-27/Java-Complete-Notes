// 204. Count Primes

// Approach 1 (Using T.C. -> O(n underoot n)

// public class countPrimes {
//     public static int primes(int n){
//         int count=0;
//         int countOne=0;

//         int val=(int)(Math.sqrt(n));

//         if(n<=1) return 0;

//         for(int i=1; i<=n; i++){
//             for(int j=2; j<=val; j++){
//                 if(n%j==0){
//                     count++;
//                     break;
//                 }
//             }
//             if(count==0){
//                 countOne++;
//             }
//         }
//         return countOne;
//     }


//     public static void main(String[] args){
//         int n=10;

//         System.out.println(primes(n));
//     }
// }

/////////////////////////////////////////////////

// Approach 2 (T.C. -> O(n log log n))

public class countPrimes{
    public static int primes(int n){
        
        if(n<=2) return 0;
        
        boolean[] flag = new boolean[n];
        
        for(int i=2; i<n; i++){
            flag[i] = true;
        }

        for(int i=2; i<Math.sqrt(n); i++){
            if(flag[i]){
                for(int j=i*i; j<n; j+=i){
                    flag[j] = false;
                }
            }
        }

        int count=0;
        for(int i=2; i<n; i++){
            if(flag[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n = 12;

        System.out.println(primes(n));
    }

}