/* Pyramid Pattern
     *
    * *
   * * *
  * * * * 
 * * * * *
*/

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

/* Solid Rhombus
            * * * * *
          * * * * *            
        * * * * * 
      * * * * *
    * * * * *
*/

 /*public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int cols = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= (rows - i) * 2; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= cols; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} */

/* 
           1
          2 2
         3 3 3
        4 4 4 4 
       5 5 5 5 5 
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
         
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                // OR num = 1 + i - 1;
                System.out.printf("%d ",i);
                
            }
            System.out.println();
        }
    }
} */


/* Inverted Pyramid Same Numbers
    1 1 1 1 1
     2 2 2 2
      3 3 3
       4 4
        5
*/


/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = rows; i >= 1; i--) {

            // every time this num will be depend upon the value of 'i' -> for eg. i = 5, so num = 5 - 5 + 1 = 1

            int num = rows - i + 1;
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.printf("%d ",num);
            }
            System.out.println();
        }
    }
} */

/* 1 1 1 1 
   2 2 2
   3 3
   4 
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;

        for(int i = rows; i >= 1; i--) {
            int num = rows - i + 1;
            for(int j = 1; j <= i; j++) {
                System.out.printf("%d ",num);
            }
            System.out.println();
        }
    }
}  */

/* Palindromic Number Pyramid
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5

*/
    /* public class patterns {
        public static void main(String []args) {
            int rows = 5;

            // outer loop -> (Define columns)
            for(int i = 1; i <= rows; i++) {
                // inner loop 1 -> (Define Spaces)
                for(int j = 1; j <= rows - i; j++) {
                    System.out.print("  ");
                }

                // 1st Half Print -> (i -> 1)
                for(int k = i; k >= 1; k--) {
                    System.out.printf("%d ",k);
                }

                // 2nd Half Print -> (2 -> i)
                for(int l = 2; l <= i; l++) {
                    System.out.printf("%d ",l);
                }
                
            
            System.out.println();
            }
        }
    }    */
    
/* Diamond Pattern 

         *
        ***
       *****
      *******
       *****
        ***
         *
*/

/* public class patterns {
    public static void main(String []args) {

        // for normal pyramid
        int rows = 5;

        // outer loop -> (Defining rows 1 - 5)
        for(int i = 1; i <= rows; i++) {
            // inner loop 1 -> (Define spaces rows - i)
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // inner loop 2 -> (Define element to print 1 - i)
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // for inverted pyramid
        int irows = 4;

        // outer loop -> (Define rows 4 - 1)
        for(int i = irows; i >= 1; i--) {
            // inner loop 1 -> (Define spaces as for inv. pyramid it starts from 1 space (4 - i + 1))
            for(int j = 1; j <= irows - i + 1; j++) {
                System.out.print(" ");
            }
            // inner loop 2 -> (Define element to print 1 -> i)
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}  */

/* Christmas Tree 
     
        *
       * *
      * * *
     * * * *
      * * *
     * * * *
    * * * * *
   * * * * * *
      * * *
     * * * *
    * * * * *
  * * * * * * *
      * * *
      * * *
      * * *
      * * *
*/

/* public class patterns {
    public static void main(String []args) {
        
        //for 1st deck
        int rows1 = 4;

        for(int i = 1; i <= rows1; i++) {
            for(int j = 1; j <= rows1 - i + 5; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
            // for 2nd deck
            int rows2 = 6;

            for(int i = 3; i <= rows2; i++) {
                for(int j = 1; j <= rows2 - i + 3; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            // for 3rd deck
            int rows3 = 6;

            for(int i = 3; i <= rows3; i++) {
                for(int j = 1; j <= rows3 - i + 3; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // for stem
            int rows4 = 4;
            int cols = 3;

            for(int i = 1; i <= rows4; i++) {
                for(int j = 1; j <= 6; j++) {
                    System.out.print(" ");
                }
                for(int k = 1; k <= cols; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
} */

/* Butterfly Pattern

*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *

*/

/* public class patterns {
    public static void main(String []args) {
        
        // left 1st deck
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
           
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            for(int j = 1; j <= 4 * (rows - i); j++) {      // the spaces are too much so we multiply 4 with it
                System.out.print(" ");
            }
            
            for(int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

       // left 2nd deck

       for(int i = rows - 1; i >= 1; i--) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for(int k = 1; k <= 4 * (rows - i); k++) {
                System.out.print(" ");
            }

            for(int l = 1; l <= i; l++) {
                System.out.print("* ");
            }
            System.out.println();
       }
    }
} */


/* Alphabets half Pyramid
A
A B
A B C
A B C D
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;
       
       // outer loop -> (Defines rows 1 -> 4)
        for(int i = 1; i <= rows; i++) {
            // character 'A' is declared after every iteration of i as every row has 1st alphabet as 'A'
            char ch = 'A';
            // inner loop -> (Defines cols using rows 1 -> i)
            for(int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                // ch++ -> to increment character by 1 after every print
                ch++;
            }
            System.out.println();
        }
    } 
} */

/* Reverse Alphabet Triangle
D C B A
C B A
B A
A
*/

/* public class patterns {
    public static void main(String[] args) {
        int rows = 4;
      
        
        for(int i = rows; i >= 1; i--) {
            // used to initialize the char 'A' at every iteration and making it add with i and - 1
            char ch = (char)('A' + i - 1);

            for(int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }   
    }
}  */

/* Alphabet Pyramid 
    A
   A B
  A B C
 A B C D
*/

/* public class patterns {
    public static void main(String[] args) {
        int rows = 4;

        for(int i = 1; i <= rows; i++) {
            char ch = 'A';
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
} */

/* Same Alphabet
A
B B
C C C
D D D D
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {

            char ch = (char) ('A' + i - 1);
            // ch is declared in inner loop bcoz we need to only reinitialize it at every row 

                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
} */

/* Complete Alphabets

A B C D E
F G H I J
K L M N O
P Q R S T
U V W X Y

*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int cols = 5;
        char ch = 'A';

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
} */

/* Increasing Alphabets
A
B C
D E F
G H I J
K L M N O
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        char ch = 'A';
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.printf("%c ",ch);
                ch++;
            }
            System.out.println();
        }
    }
} */

/* Reverse Alphabet (E - A)
E
D E
C D E
B C D E
A B C D E
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {

            // ch is initialized with ('E' - i + 1) as for i = 1; 69 - 1 = 68 + 1 = 69
            char ch = (char)('E' - i + 1);
            for(int j = 1; j <= i; j++) {
                System.out.printf("%c ",ch);
            
                // updation for each element in a row will happen here
                ch++;
            }
            System.out.println();
        }
    }
} */

/* Copy of Alphabets in Reverse
E D C B A
E D C B A
E D C B A
E D C B A
E D C B A
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int cols = 5;

        for(int i = 1; i <= rows; i++) {
                char ch = 'E';
            for(int j = 1; j <= cols; j++) {
                System.out.printf("%c ",ch);
                ch--;
            }
        System.out.println();
        }
    }
} */

/* Zig-Zag Pattern
A   B   C
  D   E
F   G   H
  I   J
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;
        int cols = 5;
        char ch = 'A';

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if((i + j) % 2 == 0) {
                    System.out.printf("%c ",ch);
                    ch++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} */

/* Chess Board
* # * # *
# * # * #
* # * # *
# * # * #
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 4;
        int cols = 4;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
} */

/* Diamond, Christmas Tree, Butterfly, Chess Board 
   Through User Input */

/* import java.util.Scanner;
public class patterns {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Patterns");

        System.out.println("Enter Choice for Patterns: ");
        System.out.println("[1] for Diamond");
        System.out.println("[2] for Christmas Tree");
        System.out.println("[3] for Butterfly");
        System.out.println("[4] for Chess Board");

        int choice = ip.nextInt();

        switch (choice) {
            case 1 : 
                System.out.println("You have opt for Diamond Pattern: ");
                System.out.println("Enter rows = ");
                int rows = ip.nextInt();
                System.out.println("Enter any Special Character for Pattern: ");
                int special = ip.nextInt();
               
                 for(int i = 1; i <= rows; i++) {
                    for(int j = 1; j <= rows - i + 4; j++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= i; k++) {
                        System.out.printf("%d ",special);
                    }
                    System.out.println();
                }

                for(int i = rows - 1; i >= 1; i--) {
                    for(int j = 1; j <= rows - i + 4; j++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= i; k++) {
                        System.out.printf("%d ",special);
                    }
                    System.out.println();
                }
                break;

            case 2 : 

                System.out.println("You have opt for Christmas Tree Pattern: ");
                System.out.println("Enter rows = ");
                rows = ip.nextInt();
                System.out.println("Enter columns = ");
                int cols = ip.nextInt();
                

                for(int i = 1; i <= rows; i++) {
                    for(int j = 1; j <= rows - i + 4; j++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

                for(int i = 3; i <= rows; i++) {
                    for(int j = 1; j <= rows - i + 4; j++) {
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }

            default : 
                System.out.println("Enter choice between 1-4");

        }        
    }
}   */


// HOLLOW PATTERNS

/* Hollow Rhombus
        * * * * *
      *       * 
    *       *
  *       *
* * * * * 
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int cols = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= cols; k++) {
                if(i == 1 || i == 5 || k == 1 || k == 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} */

/* Hollow Pyramid
    *
   * *
  *   *
 *     *
* * * * *
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                // if any of these conditions evaluates to false then print blank space
                if(i == 1 || i == 5 || k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} */

/* Inverted Hollow Pyramid

* * * * *
 *     *
  *   *
   * *
    *  
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if(i == 1 || i == 5 || k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} */

/* Hollow Right Angled Triangle
*
* *
*   *
*     *
* * * * *
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == 1 || i == 5 || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} */

/* Hollow Diamond 
    *
   * *
  *   *
   * *
    *
*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {
                if(i == 1 || k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    int rows2 = 4;

    for(int i = rows2; i >=1 ;i--) {
        for(int j = 1; j <= (rows2 - i) + 1; j++) {
            System.out.print(" ");
        }
        for(int k = 1; k <= i; k++) {
            if(i == 1 || k == 1 || k == i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
} */

/* Hollow Butterfly 
*      *
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
*      *

*/

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;

        // upper half (left & right half pyramids)

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == 1 || j == i || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 

            for(int k = 1; k <= (rows - i) * 4; k++) {
                System.out.print(" ");
            }

            for(int l = 1; l <= i; l++) {
                if(i == 1 || l == 1 || l == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        // lower half (left & right half pyramids)

        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                if(i == 1 || j == i || j ==  1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for(int k = 1; k <= (rows - i) * 4; k++) {
                System.out.print(" ");
            } 

            for(int l = i; l >= 1; l--) {
                if(i == 1 || l == i || l == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
} */

// a b c d
// a b c d
// a b c d
// a b c d

/* public class patterns {
    public static void main(String[] args) {
        int row = 4;
        int col = 4;

        for(int i = 1; i <= row; i++) {
            char ch = 'a';
            for(int j = 1; j <= col; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
} */

// 1
// A B
// 1 2 3
// A B C D
// 1 2 3 4 5


/* public class patterns {
    public static void main(String[] args) {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {
            char ch = 'A';
            for(int j = 1; j <= i; j++) {
                if (i == 1 || i == 3 || i == 5) {
                    System.out.print(j+" ");
                } else {
                    System.out.print(ch+" ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}  */

//       *  
//       *
//   * * * * * 
//       * 
//       * 

/* public class patterns {
    public static void main(String []args) {
        int rows = 5;
        int col = 5;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= col; j++) {
                if(j == 3 || i == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} */

//   *       *
//     *   *
//       * 
//     *   *
//   *       *

/* public class patterns {
    public static void main(String []args) {
        int rows = 3;

        for(int i = rows; i >= 0;i--) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++) {
                if(i == 1 || k == 1 || k == i) {
                    System.out.print("* ");
                } else { System.out.print("  "); }
            }
            System.out.println();
        }

        for(int i = 2; i <= rows; i++) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= i; k++) {
                if(k == 1 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
} */

// 1
// 1 3
// 1 3 5
// 1 3 5 7

/* public class patterns {
    public static void main(String[] args) {
        int rows = 7;

        for(int i = 1; i <= rows; i+=2) {
            for(int j = 1; j <= i; j+=2) {
                if(j % 2 != 0) {
                    System.out.print(j+" ");
                } 
            }
            System.out.println();
        }
    }
} */


/* Spiral or Zoom Pattern

1 1 1 1 1 1 1 
1 2 2 2 2 2 1
1 2 3 3 3 2 1 
1 2 3 4 3 2 1
1 2 3 3 3 2 1
1 2 2 2 2 2 1
1 1 1 1 1 1 1 */

/* import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.println("Enter the middle value: ");
        int n = ip.nextInt();

        // outer loop -> (from 1 to 7 rows i.e 2n-1)
        for(int i = 1; i <= 2*n - 1; i++) {
            // inner loop -> (from 1 to 7 rows i.e 2n-1)
            for(int j = 1; j <= 2*n - 1; j++) {
                // we define 'a' to store and compare the values from top to bottom and 'b' to store and compare the values from left to right
                int a = i;
                int b = j;

                if(i > n) a = 2 * n - i;
                if(j > n) b = 2 * n - j;
                
                // used to find the minimum
                System.out.print(Math.min(a,b)+" ");
            }
            System.out.println();
        } 
    }
} */

/* Pascal Triangle 
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
      1 5 10 10 5 1
*/

import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        for(int i = 0; i <= n; i++) {
            for(int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                
                int factOne = 1;
                int factTwo = 1;
                int factThree = 1;

                for(int x = 1; x<=i; x++) {
                    factOne *= x;
                }
                for(int y = 1; y<=j; y++) {
                    factTwo *= y;
                }
                for(int z = 1; z<=i-j;z++) {
                    factThree *= z;
                }

                int icj = factOne/(factTwo*factThree);
                System.out.print(icj+" ");
            }
            System.out.println();
        }
    }
}












