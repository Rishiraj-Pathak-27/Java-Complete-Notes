// Question 1 (WAP to print all the employee details such as name, age, salary, gender)

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
     
//         System.out.println("Enter Employee Name: ");
//         String empName = ip.nextLine();
//         System.out.println("Enter Employee Age: ");
//         int empAge = ip.nextInt();
//         System.out.println("Enter Employee Salary: ");
//         float empSalary = ip.nextFloat();
//         System.out.println("Enter Employee Gender: ");
//         char empGender = ip.next().charAt(0);
        
//         System.out.println("--------------------------");
//         System.out.println("Employee Details: ");
//         System.out.printf("Employee Name: %s\t\n",empName);
//         System.out.printf("Employee Age: %d\t\n",empAge);
//         System.out.printf("Employee Salary: %.2f\t\n",empSalary);
//         System.out.printf("Employee Gender: %s\t\n",empGender);
//     }
// }


// Question 2 (Calculator +,-,*,/)

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         int num1, num2, add, sub, mul;
//         float div;
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter number 1: ");
//         num1 = ip.nextInt();
//         System.out.println("Enter number 2: ");
//         num2 = ip.nextInt();

//         add = num1 + num2;
//         sub = num1 - num2;
//         mul = num1 * num2;
//         div = num1 / num2;

//         System.out.printf("Addition = %d\n",add);
//         System.out.printf("Subtraction = %d\n",sub);
//         System.out.printf("Multiplication = %d\n",mul);
//         System.out.printf("Division = %.2f\n",div);
//     }
// }

// Question 3 (Calculate the Gross Pay)

// import java.util.Scanner;

// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("EMPLOYEE GROSS PAYMENT");
//         System.out.println("Enter the number of hours employee work: ");
//         float hours = ip.nextFloat();
//         System.out.println("Enter the hourly wage of an employee: ");
//         float wage = ip.nextFloat();

//         float grossPay = hours * wage;
//         System.out.println("Gross Pay of an Employee is: "+grossPay);

//     }
// }


// Question 4 (x = a/(b - c))

// import java.util.Scanner;

// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the Value of a: ");
//         float a = ip.nextInt();
//         System.out.println("Enter the Value of b: ");
//         float b = ip.nextInt();
//         System.out.println("Enter the Value of c: ");
//         float c = ip.nextInt();

//         float x = a/(b - c);
//         System.out.printf("Value of x is %.2f",x);
//     }
// }

// Question 5 (WAP that generates the o/p 10,20,19)

// public class bookPS {
//     public static void main(String []args) {
//         int a = 10;
//         System.out.print(a+", ");
        
//         a+=10;
//         System.out.print(a+", ");

//         a--;
//         System.out.print(a);
//     }
// }

// Question 6 (Fahrenheit to Celcius)

// import java.util.Scanner;

// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter the temperature in Fahrenheit: ");
//         float fValue = ip.nextFloat();

//         float f_c = (fValue - 32)*5/9;

//         System.out.printf("Fahrenheit Value = %.2f\n",fValue);
//         System.out.printf("Value after converting Fahrenheit into Celcius = %.2f\n",f_c);
//     }
// }


// Question 7 (WAP to calculate the area & circumference of a circle using radius r)

// import java.util.Scanner;

// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         final float pi = 3.14f;
//         float r, area, circumference;

//         System.out.println("Enter the radius: ");
//         r = ip.nextFloat();
//         System.out.println("The radius is = "+r);
//         area = (pi*(r*r));
//         circumference = (2*pi*r);
//         System.out.printf("The area of circle is = %.2f\n",area);
//         System.out.printf("The circumference of circle is = %.2f\n",circumference);
//     }
// }

// Question 8 (Calculate the simple interest => si = (p * r * t)/100)

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         float principle, simpleInterest, rate, time;
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the Principle: ");
//         principle = ip.nextFloat();
//         System.out.println("Enter the rate of interest: ");
//         rate = ip.nextFloat();
//         System.out.println("Enter the time in years: ");
//         time = ip.nextFloat();

//         simpleInterest = (principle * rate * time)/100;
//         System.out.printf("Principle = %.2f\n",principle);
//         System.out.printf("Rate of interest = %.2f\n",rate);
//         System.out.printf("Time(in years) = %f\n",time);

//         System.out.printf("The Simple Interest = %.2f", simpleInterest);

//     }
// }

// Question 9 (Programming Exercises from book)

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         int num1,num2,newNum;
//         System.out.println("Enter the num1: ");
//         num1 = ip.nextInt();
//         System.out.println("Enter the num2: ");
//         num2 = ip.nextInt();

//         newNum = (num1 * 2) + num2; 
//         System.out.printf("The value of num1 = %d\n",num1);
//         System.out.printf("The value of num2 = %d\n",num2);
//         System.out.printf("The value of new number = %d\n",newNum);

//     }
// }

// Question 10 (Area & Perimeter of the rectangle)

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         float area, perimeter, length, width;

//         System.out.println("Enter the length = ");
//         length = ip.nextFloat();
//         System.out.println("Enter the width = ");
//         width = ip.nextFloat();

//         area = length * width;
//         perimeter = 2 * (length + width);

//         System.out.printf("Entered Length = %.2f\n",length);
//         System.out.printf("Entered Width = %.2f\n",width);
//         System.out.printf("Area of Rectangle = %.2f\n",area);
//         System.out.printf("Perimeter of Rectangle = %.2fn",perimeter);
//     }
// }

// Question 10 (i/p -> 1,2,3,4,5 o/p -> 5,4,3,2,1 without loop)

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         int a,b,c,d,e,res;
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter num1: ");
//         a = ip.nextInt();
//         System.out.println("Enter num2: ");
//         b = ip.nextInt();
//         System.out.println("Enter num3: ");
//         c = ip.nextInt();
//         System.out.println("Enter num4: ");
//         d = ip.nextInt();
//         System.out.println("Enter num5: ");
//         e = ip.nextInt();

//        System.out.println();
//        System.out.println(e);
//        System.out.println(d);
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a);
    
//     }
// }

// OR

// import java.util.Scanner;
// public class bookPS {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter any 5 numbers: ");
//         String num = ip.nextLine();

//         System.out.println(num.charAt(4));
//         System.out.println(num.charAt(3));
//         System.out.println(num.charAt(2));
//         System.out.println(num.charAt(1));
//         System.out.println(num.charAt(0));

//     }
// }

////////////////////////////////////////////////////////////////