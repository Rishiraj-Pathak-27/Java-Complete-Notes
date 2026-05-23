// 326. Power of Three

// public class powerOfThree {

//     public static boolean power(int n){
        
//         for(int i=0; i<100; i++){
//             if(Math.pow(3,i)==n){
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args){
//         int n=3;
//         System.out.println(power(n));
//     }    
// }


// OR

public class powerOfThree {

    public static boolean power(int n){
        
        while(n%3==0){
            n/=3;
        }

        return n==1;
    }

    public static void main(String[] args){
        int n=3;
        System.out.println(power(n));
    }    
}
