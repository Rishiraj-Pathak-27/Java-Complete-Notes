/**  Question 1 (O/p of the below program) 
 * int a = 10;
 * if(a = 11) {
 * System.out.println("I am 11");
 * }
 * else {
 * System.out.println("I am not 11");
 * } 
*/

// public class PS4 {
//     public static void main(String []args){
// int a = 10;
// if(a = 11) {
//     System.out.println("I am 11");
// }
// else {
//     System.out.println("I am not 11");
// }
// }
// }

// Question 2 (write a program to find out whether a student is pass or fail if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user)

// import java.util.Scanner;
// public class PS4 {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the name of Student: ");
//         String name = ip.nextLine();
//         System.out.println("Enter marks of ENGLISH: ");
//         float SubMarks1 = ip.nextFloat();
//         System.out.println("Enter marks of MATHS: ");
//         float SubMarks2 = ip.nextFloat();
//         System.out.println("Enter the marks of SCIENCE: ");
//         float SubMarks3 = ip.nextFloat();
//         float subPassing = 33.0f;
//         float totalMarks = SubMarks1 + SubMarks2 + SubMarks3;
//         float percentage = (SubMarks1 + SubMarks2 + SubMarks3)/300 * 100;
//         float totalPassing = 40.0f;
       
        
//        if(SubMarks1 > subPassing && SubMarks2 > subPassing && SubMarks3 > subPassing) {
//         if(totalMarks > totalPassing) {
//             System.out.printf("Student name = %s\n",name);
//             System.out.printf("Total Marks Scored = %.2f\n",totalMarks);
//             System.out.printf("Percentage Scored = %.2f\n",percentage);
//             System.out.println("Hurray you passed the exam!");
//         }
//        }
//        else {
//         System.out.printf("Student name = %s\n",name);
//         System.out.printf("Total Marks Scored = %.2f\n",totalMarks);
//         System.out.printf("Percentage Scored = %.2f\n",percentage);
//         System.out.println("Upps you failed in anyone or all of the subjects!");
//        }
//         }
//     }

// Question 3 (Calculate the income tax payed by an employee based on its income)

// import java.util.Scanner;
// public class PS4 {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         String name;
//         float salary;
//         System.out.println("Enter the name of Employee: ");
//         name = ip.nextLine();
//         System.out.println("Enter your Salary: ");
//         salary = ip.nextFloat();

//         if(salary >= 250000 && salary <= 500000) {
//             System.out.println("Name of employee = "+name);
//             System.out.println("Salary of employee = "+salary);
//             System.out.println("Tax to be paid = 5%");
//         }
//         else if(salary >= 500000 && salary <= 1000000) {
//             System.out.println("Name of employee = "+name);
//             System.out.println("Salary of employee = "+salary);
//             System.out.println("Tax to be paid = 20%");
//         }
//         else if(salary >= 1000000) {
//             System.out.println("Name of employee = "+name);
//             System.out.println("Salary of employee = "+salary);
//             System.out.println("Tax to be paid = 30%");
//         }
//         else {
//             System.out.println("Name of employee = "+name);
//             System.out.println("Salary of employee = "+salary);
//             System.out.println("No need to pay any tax");
//         }
//     }
// }

// Question 4 (WAP to find the day using the day number of the week)

// import java.util.Scanner;
// public class PS4 {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the number of the day (1-7): ");
//         int dayNum = ip.nextInt();

//         switch (dayNum) {
//             case 1 : {
//                 System.out.println("Monday");
//                 break;
//             }
//             case 2 : {
//                 System.out.println("Tuesday");
//                 break;
//             }
//             case 3 : {
//                 System.out.println("Wednesday");
//                 break;
//             } 
//             case 4 : {
//                 System.out.println("Thursday");
//                 break;
//             }
//             case 5 : {
//                 System.out.println("Friday");
//                 break;
//             }
//             case 6 : {
//                 System.out.println("Saturday");
//                 break;
//             }
//             case 7 : {
//                 System.out.println("Sunday");
//                 break;
//             }
//             default : {
//                 System.out.println("Enter a valid day number.");
//             }

//         }
//     }
// }

// Question 5 (WAP to find a number is leap year or not)

// import java.util.Scanner;
// public class PS4 {
//     public static void main(String []args) {
//         int year;
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter year: ");
//         year = ip.nextInt();

//         if(year % 4 == 0) {
//             System.out.printf("\"%d\" is a leap year",year);
//         }
//         else {
//             System.out.printf("\"%d\" is not a leap year",year);
//         }
//     }
// }

// Question 6 (WAP to find out the type of website from the URL)

// import java.util.Scanner;
// public class PS4 {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the site: ");
//         String site = ip.nextLine();

//         if(site.endsWith("com")){
//             System.out.printf("Site \"%s\" is a commercial Website\n",site);
//         }
//         else if(site.endsWith("org")) {
//             System.out.printf("Site \"%s\" is a Organizational Website\n", site);
//         }
//         else if(site.endsWith("in")) {
//             System.out.printf("Site \"%s\" is a Indian Website\n",site);
//         }
//         else if(site.endsWith("edu")) {
//             System.out.printf("Site \"%s\" is a Educational Website\n", site);
//         }
//         else {
//             System.out.println("Enter a valid site & should end with (com, org, in)");
//         }
//     }
// }


// Code to take userinput and store in the form of String, double, integer.

// import java.util.Scanner;

// public class PS4 {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
   
//         // Write your code here.
//         scan.nextLine();
//         String s = scan.nextLine();
//         double d = scan.nextDouble();
//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + i);
//     }
// }

