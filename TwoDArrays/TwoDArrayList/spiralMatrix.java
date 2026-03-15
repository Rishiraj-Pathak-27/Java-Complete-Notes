// WAP to spirally traverse the 2D matrix spirally

import java.util.ArrayList;

public class spiralMatrix {

    public static ArrayList<Integer> spiralTraversal(int[][] arr){
        int n=arr.length, m=arr[0].length;

        int fr=0, fc=0, lr=n-1, lc=m-1, count=0, total=m*n;

        ArrayList<Integer> ans = new ArrayList<>();

        while(count<total){
            for(int i=fc; i<=lc; i++){
                ans.add(arr[fr][i]);
            }
            if(fr>lr || fc>lc) break;
            fr++;

            for(int j=fr; j<=lr; j++){
                ans.add(arr[j][lc]);
            }
            if(fr>lr || fc>lc) break;
            lc--;

            for(int k=lc; k>=fc; k--){
                ans.add(arr[lr][k]);
            }
            lr--;
            if(fr>lr || fc>lc) break; 

            for(int l=lr; l>=fr; l--){
                ans.add(arr[l][fc]);
            }
            fc++;
        }

        return ans;
    }

    public static void main(String[] args){
        
        int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}, {25,26,27,28,29,30}};
        System.out.println(spiralTraversal(arr));
    }    
}


// OR


// import java.util.ArrayList;

// public class spiralMatrix {

//     public static ArrayList<Integer> spiralTraversal(int[][] arr){
//         int n=arr.length, m=arr[0].length;

//         int fr=0, fc=0, lr=n-1, lc=m-1;

//         ArrayList<Integer> ans = new ArrayList<>();

//         while(fr<=lr && fc<=lc){
//             for(int i=fc; i<=lc; i++){
//                 ans.add(arr[fr][i]);
//             }
//             if(fr>lr || fc>lc) break;
//             fr++;

//             for(int j=fr; j<=lr; j++){
//                 ans.add(arr[j][lc]);
//             }
//             if(fr>lr || fc>lc) break;
//             lc--;

//             for(int k=lc; k>=fc; k--){
//                 ans.add(arr[lr][k]);
//             }
//             lr--;
//             if(fr>lr || fc>lc) break; 

//             for(int l=lr; l>=fr; l--){
//                 ans.add(arr[l][fc]);
//             }
//             fc++;
//         }

//         return ans;
//     }

//     public static void main(String[] args){
        
//         int[][] arr = {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}, {25,26,27,28,29,30}};
//         System.out.println(spiralTraversal(arr));
//     }    
// }
