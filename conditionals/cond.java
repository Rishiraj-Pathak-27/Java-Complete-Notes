// EG. of If-Statement

// import java.util.Scanner;
// public class cond {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter your age: ");
//         int age = ip.nextInt();

//         if(age > 18) {
//             System.out.println("Your are eligible to drive!");
//         }
        
//     }
// }


// EG. of If-else statement

// import java.util.Scanner;
// public class cond {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int num = ip.nextInt();

//         if(num % 2 == 0) {
//             System.out.println("Even number");
//         }
//         else {
//             System.out.println("Odd number");
//         }
//     }
// }

// EG. of Nested-If statement

// import java.util.Scanner;

// public class cond {
//     public static void main(String []args) {
//         int salary;
//         float experience;
//         String name;
   
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter your name: ");
//         name = ip.nextLine();
//         System.out.println("Enter the current experience you have as Employee: ");
//         experience = ip.nextFloat();
//         System.out.println("Enter the current salary you have as Employee: ");
//         salary = ip.nextInt();
//         System.out.printf("Employee Name = %s\n",name);

//         if(salary>=8000) {
            
//             if(experience>=15){
//                 int totalSalary;    
//                 totalSalary = salary + 1500;
//                 System.out.printf("You have got a salary hike of 1500 = %d",totalSalary);
//             }
//         }
//         else{
           
//             if(experience<=15) {
//                 int totalSalaryOne;
//                 totalSalaryOne = salary + 1000;
//                 System.out.printf("You got a salary hike of 1000 = %d",totalSalaryOne);
            
//         }        
            
//     }

//     }
// }


// EG. of nested if-else statement.

// import java.util.Scanner;
// public class cond {
//     public static void main(String []args) {
//         float marks;
//         String name;

//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the name of Student: ");
//         name = ip.nextLine();
//         System.out.println("Enter marks: ");
//         marks = ip.nextFloat();

//         if(marks >= 80) {
//             System.out.println("Name of Student = "+name);
//             System.out.println("Marks of Student = "+marks);
//             System.out.println("Secured = Distinction");
//         }

//         else if(marks < 80 && marks >=60) {
//             System.out.println("Name of Student = "+name);
//             System.out.println("Marks of Student = "+marks);
//             System.out.println("Secured = First Class");
//         }

//         else if(marks < 60 && marks >= 50) {
//             System.out.println("Name of Student = "+name);
//             System.out.println("Marks of Student = "+marks);
//             System.out.println("Secured = Second Class");
//         }

//         else if(marks < 50 && marks >=40) {
//             System.out.println("Name of Student = "+name);
//             System.out.println("Marks of Student = "+marks);
//             System.out.println("Secured = Third Class");
//         }

//         else {
//             System.out.println("Name of Student = "+name);
//             System.out.println("Marks of Student = "+marks);
//             System.out.println("Secured = Unsuccessful");
//         }
//     }
// }

// EG. of SWITCH CASE -> Student Grade

// import java.util.Scanner;
// public class cond {
//     public static void main(String []args) {
//         String name;
//         char grade;
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter name of Student: ");
//         name = ip.nextLine();
//         System.out.println("Enter grade of Student in Character (eg.A,B,C,D,F): ");
//         grade = ip.next().charAt(0);    // if only .next() then it will tak the whole string but we want only one char so .charAt(0) extracts the first char from that string

//         switch(grade) {
//             case 'A' : {
//                 System.out.printf("Name of Student  = %s\n",name);
//                 System.out.printf("Grade Obtained  = %c\n",grade);
//                 System.out.println("Secured Position = DISTINCTION");
//                 break;
//             }
//             case 'B' : {
//                 System.out.printf("Name of Student  = %s\n",name);
//                 System.out.printf("Grade Obtained  = %c\n",grade);
//                 System.out.println("Secured Position = FIRST CLASS");
//                 break;
//             }
//             case 'C' : {
//                 System.out.printf("Name of Student  = %s\n",name);
//                 System.out.printf("Grade Obtained  = %c\n",grade);
//                 System.out.println("Secured Position = SECOND CLASS");
//                 break;
//             }
//             case 'D' : {
//                 System.out.printf("Name of Student  = %s\n",name);
//                 System.out.printf("Grade Obtained  = %c\n",grade);
//                 System.out.println("Secured Position = THIRD CLASS");
//                 break;
//             }
//             case 'F' : {
//                 System.out.printf("Name of Student  = %s\n",name);
//                 System.out.printf("Grade Obtained  = %c\n",grade);
//                 System.out.println("Secured Position = FAIL");
//                 break;
//             }
//             default : {
//                 System.out.printf("Entered character \"%c\" was not recognized or it is an incorrect character.\n",grade);
//             }
//         }
//     }
// }
