/** WAP to sum first n even numbers using while loop */

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int n = ip.nextInt();
//         int i = 1;
//         int sum = 0;

//         System.out.printf("Even numbers will range between 1 - %d\n",n);
        
//         while(i <= n) {

//             if(i % 2 == 0) {
//                 System.out.println("Even number = "+i);
//                 sum += i;
//             }

//             i++;
//         }
//         System.out.println("Sum of even numbers = "+sum);
//     }
// }

/** WAP to print multiplication table of a given number n */

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter a number to print multiplication table: ");
//         int num = ip.nextInt();

//         for(int i = 1; i <= 10; i++) {
//             int n = num * i;

//             System.out.printf("%d x %d = %d\n",num,i,n);
//         }
//     }
// }

/** WAP to print multiplication table of 10 in reverse order */

/* public class loops {
    public static void main(String []args) {
        int table = 10;
        int res;

        for(int i = 10; i >= 1 ;i--) {
            res = table * i;

            System.out.printf("%d x %d = %d\n",table,i,res);
        }
    }
} */

/** WAP to calculate the factorial of a number through user input */

// using (for - loop)

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = ip.nextInt();
            int i;
            int fact = 1;
            
            if(num == 0 || num == 1) {
                System.out.printf("Factorial of %d is 1\n",num);
            }
            else {
                for(i = num; i >= 1; i--) {
                    fact = fact * i;
                }
                System.out.printf("Factorial of %d = %d\n",num,fact);
            }
        }
    } */

// using (while - loop)

/* import java.util.Scanner;
public class loops {    
   public static void main(String []args) {
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = ip.nextInt();
    int i = num;
    int fact = 1;

    
        if(num == 0 || num == 1) {
            System.out.printf("Factorial of %d is 1",num);
        }

        else {

            while(i >= 1) {
                fact = fact * i;
                i--;
            }

            System.out.printf("Factorial of %d is %d",num,fact);
        }
    }
} */

// using (do-while - loop)

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = ip.nextInt();
//         int i = num;
//         int fact = 1;

       
//             if(num == 0 || num == 1) {
//                 System.out.printf("Factorial of %d is 1",num);
//             }
//             else {
//                 do {
//                 fact = fact * i;
//                 i--;
//                 } while (i >= 1);
//                 System.out.printf("Factorial of %d is %d",num,fact);
//             }
//         }
//     }


/** WAP to repeat 5 using while loop */

//  import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter how many times you want to repeat number 5: ");
//         int num = ip.nextInt();
//         int i = 1;
//         while(i <= num) {
//             System.out.println(5);
//             i++;
//         }
//     }
// } 

/** WAP to calculate the sum of the numbers occuring in the multiplication table of 8 */
 
// using (for loop)

/* public class loops {
    public static void main(String []args) {
        int num = 8;
        int count;
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            count = num * i;
            sum += count;
            System.out.printf("%d x %d = %d\n",num,i,count);
        }
        System.out.println("Sum of table 8 = "+sum);

    }
} */

// using (while loop)

/* public class loops {
    public static void main(String []args) {
        int table = 8;
        int count;
        int sum = 0;
        int i = 1;

        while(i <= 10) {
            count = table * i;
            sum += count;

            System.out.printf("%d x %d = %d\n",table,i,count);
            i++;
        }
        System.out.println("Sum = "+sum);
    }
} */

// using (do-while loop)

/* public class loops {
    public static void main(String []args) {
        int table = 8;
        int i = 1;
        int count;
        int sum = 0;

        do {
            count = table * i;
            sum += count;

            System.out.printf("%d x %d = %d\n",table,i,count);
            i++;
        } while(i <= 10);

        System.out.println("Sum = "+sum);
    }
} */

/** WAP to repeat 1 using for/while loop */

// using for loop

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter how many times you want to repeat number 1: ");
        int num = ip.nextInt();

        for(int i = 1; i <= num ; i++) {
            System.out.println(1);
        }
    }
}  */

// using while loop

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter how many times you want to repeat 1: ");
        int num = ip.nextInt();
        int i = 1;

        while(i <= num) {
            System.out.println(1);
            i++;
        }
    }
} */

/** WAP to repeat 2 using for loop */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter how many times you want to repeat 2: ");
        int num = ip.nextInt();

        for(int i = 1; i <= num; i++) {
            System.out.println(2);
        }
    }
} */

/** A café owner wants to know how many cups of coffee are sold each day for a week.
→ Ask the user to input the number of cups sold each day for 7 days and print the total. */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        int days = 8;
        int sum = 0;

        for(int i = 1; i <= 7; i++) {
        System.out.printf("Enter the number of cups sold at day %d: ",i);
        int cupsSold = ip.nextInt();

        System.out.printf("Coffee cups sold at day %d = %d\n",i,cupsSold);

        sum += cupsSold;

        }
        System.out.println("Sum of total coffee cups sold in 7 days= "+sum);
    }
} */

/** Ask the user to input temperatures (in Celsius) for 5 days and print their Fahrenheit equivalents. */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        int days = 5;
        int i = 1;
        do {
            System.out.printf("Enter tempeature for day %d (in celcius): ",i);
            float tempeatureCelcius = ip.nextFloat();

            float fahrenheit = ((9.0f/5.0f * tempeatureCelcius) + 32.0f);

            System.out.printf("Fahrenheit Temperature for day %d = %.2f\n",i,fahrenheit);

            i++;
        } while(i <= 5);
    }
} */

/** Calculate the total amount after n years given a principal, annual interest rate, and years — using a loop to add compound interest year by year. */

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter your Principal (initial amount): ");
//         float principal = ip.nextFloat();
//         System.out.println("Enter annual interest rate: ");
//         float interest = ip.nextFloat();
//         System.out.println("Enter the starting year: ");
//         int startYear = ip.nextInt();
//         System.out.println("Enter for how many years you want to calculate the total amount with compound interest: ");
//         int year = ip.nextInt();
//         float sum = 0;
//         float totalAmount;
       
//         System.out.println();
        
//         System.out.printf("Principal = %.2f\n",principal);
//         System.out.printf("Interest = %.2f\n",interest);
//         System.out.printf("Starting year = %d\n",startYear);
//         System.out.printf("Total number of years = %d\n",year);

//         for(int i = 1; i <= year; i++) {

//         totalAmount = principal * interest/100;
//         principal += totalAmount;
//         System.out.printf("After year %d: %.2f\n",i,principal);
       
//         }

//         System.out.printf("The total amount after %d years = %.2f",year,principal);

//     }
// }


/** Input a number and calculate the sum of its digits (e.g., 123 → 6). */

/* public class loops {
    public static void main(String []args) {
        int num = 875;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum += rem;

            num /= 10;          // or num = num / 10;
        }

        System.out.println("Sum of num = "+sum);
    }
} */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = ip.nextInt();
        int sum = 0;

        while(num != 0){

        int rem = num % 10;
        sum += rem;

        num /= 10;

        }
        System.out.println("Sum of num = "+sum);
    }
} */

/** Input a number and display its reverse (e.g., 1234 → 4321). */

/* public class loops {
    public static void main(String []args) {
        
        int num = -1234;
        int reverse = 0;


        int sign = 1;
        if(num < 0) {
            sign = -1;
            num = -num;
        }

        while (num > 0) {

            int rem = (num % 10);   // 4
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        reverse = reverse * sign;
        System.out.println("Reverse numbers = "+reverse);
      
    }
}  */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number in series: ");
        int num = ip.nextInt();
        int reverse = 0;

        while(num != 0) {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num /= 10;
        }
        System.out.println("Reverse number = "+reverse);  // 3 2 1 0
    }
}  */

// code for also expecting 0 in output using string 

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String num = ip.nextLine();

        String reverse = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            reverse = reverse + num.charAt(i);
        } 
        System.out.println("Reverse number = "+reverse);

    }
} */


/** Use a for or while loop to find the factorial of a given number. */

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = ip.nextInt();
//         int fact = 1;

//         if(num == 1 || num == 0) {
//             System.out.printf("The factorial of %d = 1",num);
//         }
//         else {
//             for(int i = num; i >= 1; i--) {
                
//                 fact *= i;
//             }
//             System.out.printf("Factorial of %d = %d",num,fact);
//         }
//     }
// }


/** A bus has 40 seats. Use a loop to simulate passengers booking seats one by one until the bus is full. */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("BUS Simulator");
             
        String originalPin = "2712";
        int totalSeats = 40;
        int remainingSeats = 0;


        while(totalSeats > remainingSeats) {
            System.out.println();
            System.out.println("Enter PIN: ");
            String pin = ip.nextLine(); 
      

        if(pin.equals(originalPin)) {
            System.out.println("Enter number of seats you want to book: ");
            int seats = ip.nextInt();
            ip.nextLine();

            if(seats <= totalSeats) {
            System.out.println("Per seat price = 3000/-");
            System.out.printf("Total seats = %d\nTotal Price = %d/-\n",seats,(seats * 3000));
            totalSeats = totalSeats - seats;
            System.out.println("Seats remaining = "+totalSeats);
            }
            else {
                System.out.println("Seats are full");
            }
        }

        else {
            System.out.println("Incorrect Pin restart the simulator");
        }

        }
    }
} */


/** WAP to find out the factors of a given number */

// import java.util.Scanner;
// public class loops {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter a number: ");
//         int num = ip.nextInt();
//         int count = 0;

//         for(int i = 1; i <= num ; i++) {
//             if(num % i == 0) {
//                 System.out.printf("Factors of number \"%d\" = %d\n",num,i);
//                 count++;
//             }
//             System.out.println("Total factors of num" + num+ "= "+count);
//         } 
//     }
// }


/** Take a number and check whether it’s prime or not using loops. */

/* import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ip.nextInt();
        int count = 0;

        if(num == 1 || num == 2) {
            System.out.printf("%d is a prime number",num);
        }
        else {
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }
            if(count == 2) {
                System.out.printf("%d is a Prime Number",num);
            }
            else {
                System.out.printf("%d is not a Prime Number",num);
            }
        }
    }
} */

/** Input two numbers and use loops to find their GCD. */

// Euclidean Method

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter 1st Number: ");
        int num1 = ip.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = ip.nextInt();
        
        while(num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.printf("GCD = "+num1);

    }
} */

// Repeated Subtraction Method

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = ip.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = ip.nextInt();
        
        while(num1 != num2) {
          if(num1 > num2) {
            num1 -= num2;
            
          }
          else if(num2 > num1) {
            num2 -= num1;
            
          }
        }
        System.out.println("GCD = "+num1);    
    }
}  */

// Listing Factors

// public class loops {
//     public static void main(String []args) {
//         int num1 = 48;
//         int num2 = 18;
//         int gcd = 1;

//         for(int i = 1; i <= num1; i++) {
//             if(num1 % i == 0 && num2 % i == 0){
//                 gcd = i;
//             }
//         }
//         System.out.println(gcd);
//     }
// }


// Compute the sum of the series:

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ip.nextInt();
        int total = 0;

        for(int i = 1; i <= num; i++) {
            int res = i * i;
            total += res;   
            System.out.println(res); 
        }
        System.out.printf("Total = %d",total);

    }
} */

// Input a range (say 10 to 50) and print all prime numbers in that range.

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter start of range: ");
        int start = ip.nextInt();
        System.out.println("Enter end of range: ");
        int end = ip.nextInt();
        int count;

        for(int i = start; i <= end; i++) {
            count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            }

        if(count == 2) {
            System.out.println(i + " ");
        }
        }   
    }
} */

// Fibonacci Series of Numbers

/* public class loops {
    public static void main(String []args) {
        int n = 10, firstNum = 0, secondNum = 1;
        int nextNum;

        for(int i = 1; i <= n; i++) {
            System.out.print(firstNum + " ");

            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum; 
        }
    }
} */

// WAP to check wheather a given integer number is Palindromic or not

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = ip.nextInt();
        
        int originalNum = num;
        int reverse = 0;

    
        while(num != 0) {

            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;

        }

        if(originalNum < 0 || originalNum != reverse) {
            System.out.printf("%d is not a Palindromic number",originalNum);
        } else {
            System.out.printf("%d is a Palindromic number",originalNum);
        }

        
    }
}  */

// WAP to check wheather a given string number is Palindromic or not

/* import java.util.Scanner;
public class loops {
public static void main(String []args) {
    
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter a word: ");
    String str = ip.nextLine();

    int start = 0;
    int end = str.length() - 1;

    while (start < end) {
        
        if(str.charAt(start) == str.charAt(end)) {
            start++;
            end--;
        } else {
            System.out.println("Not a Palindrome String");
            return;
        }
    }
    System.out.println("Palindrome String");

    }
} */


// WAP to check wheather an integer no. is Palindrome or not using recurring reversion

/* import java.util.Scanner;
public class loops {
    static int isSumPalindrome(int n) {
        
        int reverse = 0;
        int originalNum = n;
        int sum = 0;
        int res;
        while(n != 0) {
            
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            sum += rem;
            n /= 10;

            res = originalNum + reverse; 

        }
        if(originalNum != reverse || originalNum < 0) {
            System.out.println("not palindrome");
        } else {
            System.out.println("palindrome");
        }

        System.out.println(reverse);
        System.out.println(sum);
       

    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a n0: ");
        int n = ip.nextInt();
    }
} */


/* Given a positive integer N, write a program to:
Traverse all numbers from 1 to N
For each number:
If the number is divisible by 3, print "Fizz"
If the number is divisible by 5, print "Buzz"
If the number is divisible by both 3 and 5, print "FizzBuzz"
Otherwise, print the number itself. */


// public class loops {
//     public static void main(String[] args) {
//         int n = 15;
//         boolean isFizz = true;
//         boolean isBuzz = true;
//         boolean isFizzBuzz = true;
//         int countFizz = 0,countBuzz = 0, countFizzBuzz = 0;

//         for(int i = 1; i <= n; i++) {
//             if(i % 3 == 0 && i % 5 == 0) {
//                 isFizzBuzz = true;
//                 System.out.println("FizzBuzz");
//                 countFizzBuzz++;
//             }
        
//             else if(i % 3 == 0) {
//                 isFizz = true;
//                 System.out.println("Fizz");
//                 countFizz++;
//             } else if(i % 5 == 0) {
//                 isBuzz = true;
//                 countBuzz++;
//                 System.out.println("Buzz");
//             }  else {
//                 System.out.println(i);
//             }
//         }

//         System.out.println("Fizz count "+countFizz);
//         System.out.println("Buzz count "+countBuzz);
//         System.out.println("FizzBuzz count "+countFizzBuzz);
//     }
// }


/* import java.util.Scanner;
public class loops {

    public static void main(String[] args) {
       Scanner ip = new Scanner(System.in);
       int n = ip.nextInt();
       
       for(int i = 1; i <= n; i++) {
        
       if(i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
       } else if(i % 3 == 0) {
        System.out.println("Fizz");
        } else if(i % 5 == 0) {
        System.out.println("FizzBuzz"); } 
        else { System.out.println(i); }
    }
        
    }
} */

// WAP to check wheather a number is an Armstrong Number.

/* import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        System.out.println("Enter a number: ");
        int n = ip.nextInt();
        int temp = n;
        

        while(temp!=0) {
            temp = temp/10;       // eg. 15.3 = 15
            count++;  // 1
        }
        System.out.println("Digit Count = "+count);
        
        temp = n;

        while(temp>0){
            int rem = temp%10;
            sum = (int)(sum + Math.pow(rem,count));
            temp = temp/10;
        }

        System.out.println("Sum of number itself: "+sum);

        if(sum == n) {
            System.out.printf("%d is an Armstrong Number\n",n);
        } else {
            System.out.printf("%d is not an Armstrong Number\n",n);
        }
    }
} */


/** ATM Simulation:
Write a program that asks the user to enter a PIN. Keep asking until the correct PIN (e.g., 1234) is entered. Limit attempts to 3. */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        int i;
        int attempts = 3;

        System.out.println("You will get 3 chances to enter ATM Pin");
        for(i = 1; i <=attempts ; i++) {
            System.out.println("Enter ATM Pin: ");
            int pin = ip.nextInt();

            if(pin == 1234){
                System.out.println("Amount withdrawing...");
                break;

            }
            else {
                    System.out.println("Wrong Pin, chances remaining = "+(attempts - i));
            }

        }
        
        System.out.println("Card is blocked");
    }
}  */

/** Even & Odd Counter:
Take a number n from the user and print how many numbers between 1 and n are even and how many are odd. */

/* import java.util.Scanner;
public class loops {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = ip.nextInt();
        int count = 0;
        int counter = 0;
        for(int i = 1; i <= num; i++) {
            System.out.println();
            if(i % 2 == 0) {
                System.out.printf("%d is an even number\n",i);
                count++;
            }
            else {
                System.out.printf("%d is an odd number\n",i);
                counter++;
            }
        }
        System.out.println("\nTotal even numbers = "+count);
        System.out.println("\nTotal odd numbers = "+counter);
    }
} */

/* Write a program that prints numbers from 1 to 50.
For each number:

If the number is even and divisible by 3, print "EvenThree"
If the number is even, print "Even"
If the number is odd and divisible by 3, print "OddThree"
Otherwise, print the number itself */

/* public class loops {
    public static void main(String[] args) {
        for(int i=1; i<51; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("EvenThree");
            } else if(i % 2 != 0 && i % 3 == 0) {
                System.out.println("OddThree");
            } else if (i % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println(i);
            }
        }
    }
} */

// WAP to calculate the GCD of 2 numbers

/* import java.util.Scanner;
public class loops{
    public static int gcd(int a, int b){
        // if(a==0) return b;
        // return gcd(b%a,a);

        // OR

        while(a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    } 
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        int a=ip.nextInt();
        int b=ip.nextInt();

        System.out.println("GCD = "+gcd(a,b));
    }
} */

