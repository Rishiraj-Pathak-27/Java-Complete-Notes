// Basic Patterns

/* *
   *
   *
   * 
   *  */

/* public class patterns {
    public static void main(String []args) {
        for(int i = 1; i <= 5; i++) {
           System.out.println("*");
        }
    }
}  */


/* *****
   *****
   *****
   ***** */

// (Solid Rectangle)

/* public class patterns {
    public static void main(String []args) {
        
        // outer loop -> (Defining rows)
        for(int i = 1; i <= 4; i++) {

            // inner loop -> (Defining stars)
            for(int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */


/* *****
   *   *
   *   *
   *****
*/

// (Hollow Rectangle)

/* public class patterns {
    public static void main(String []args) {
        int start = 1;
        int end = 5;

        for(int i = 1; i <= 4; i++) {       // outer for loop responsible for each row
            for(int j = 1; j <= 5; j++) {   // inner for loop responsible for each column
                if(j == start || j == end || i == start || i == 4){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}  */

/* *
   * *
   * * *
   * * * * 
*/

// (Increasing Half Pyramid)

/* public class patterns {
    public static void main(String []args) {
        int row = 4;

        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}  */

/* * * * *
   * * *
   * *
   *  
*/

// (Decreasing Half Pyramid)

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;
        
        // outer loop -> (Defining rows)
        for(int i = rows; i >= 1; i--) {
            // inner loop -> (Defining Stars)
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */

/*     *
     * *
   * * *
 * * * *
*/
//(180 deg half pyramid)

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;

        // outer loop -> (Defining rows)
        for(int i = 1; i <= rows; i++) {
            // inner loop 1 -> (Defining Spaces before stars)
            for(int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
               }
               // inner loop 2 -> (Defining Stars after spaces)
                for(int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
} */

/*  * * * *
      * * *
        * *
          *
*/

// 180 deg rotated pyramid decreasing

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;

        // outer loop -> (Defining Rows)
        for(int i = rows; i >= 1; i--) {
            // inner loop 1 -> (Defining spaces before stars in decreasing order)
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // inner loop 2 -> (Defining stars after spaces)
            for(int k = 1; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
} */

/* 1
   1 2
   1 2 3
   1 2 3 4
   1 2 3 4 5
*/
// Half Pyramid with Numbers

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }

    }
} */


/* 1 2 3 4 5
   1 2 3 4
   1 2 3
   1 2 
   1
 */
// Inverted Half Pyramid with Numbers

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        // outer loop -> (Defining rows in decremented order)
        for(int i = rows; i >= 1; i--) {                 
            // inner loop -> (Defining numbers to print)
            for(int j = 1; j <= i; j++) {                // OR for(int j = 1; j <= rows - i + 1; j++)  -> 5 - 1 + 1 = 5
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}  */

/*      1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
*/

// Half pyramid of numbers 180 deg rotated

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
} */

/* 5 4 3 2 1
     4 3 2 1
       3 2 1
         2 1
           1
*/

// Half pyramid of numbers 180deg rotated decremented

 /* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}  */

/* 1 2 3 4 5 
     1 2 3 4
       1 2 3
         1 2
           1
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        
        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
} */

/* 1
   2 3
   4 5 6
   7 8 9 10
   11 12 13 14 15 
*/

// Floyd's Triangle

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int number = 1;   

        // outer loop -> (Defining rows = 5)
        for(int i = 1; i <= rows; i++) {
            // inner loop -> (Defining numbers at each row based on i)
            for(int j = 1; j <= i; j++) {
               System.out.printf("%d ",number);    // printing current number
               number++;                           // incrementing number by 1 at after each print
            }
            System.out.println();
        }
    }
} */

/* 1
   0 1
   1 0 1
   0 1 0 1
   1 0 1 0 1
*/

// 0-1 triangle

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i ; j++) {
                if((i + j) % 2 == 0) {     // when sum is even
                    System.out.print("1 ");
                }
                else {                    // when sum is odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
} */

/*      *
       * *
      * * *
     * * * *
    * * * * *
*/

// pyramid

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */

/*
1
22
333
4444
55555
*/

// Same Number Pattern

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
            System.out.print(i);
        }
    System.out.println();
    }
}
} */

// using while loop

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int i = 1; 
        int j = 1;

        while(i <= rows) {
            j = 1;
            while(j <= i) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
    }
} */


