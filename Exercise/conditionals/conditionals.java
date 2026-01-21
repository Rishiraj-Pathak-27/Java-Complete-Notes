/** Problem statement to solve on the conditional statements */

// A cinema charges ₹150 for adults and ₹100 for children under 12. Write a program that takes a person’s age and tells the ticket price.

/* import java.util.Scanner;
public class conditionals {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ip.nextInt();

        if(age < 12) {
            System.out.printf("Your age is %d so you have to pay 100rs to watch cinema.",age);
        }
        else {
            System.out.printf("Your age is %d so you have to pay 150rs to watch cinema.",age);
        }
    }
} */

// Input the color of a traffic light (red, yellow, green) and output what a driver should do (stop, get ready, go).

/* import java.util.Scanner;
public class conditionals {
    public static void main(String []args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the traffic light color: ");
        String trafficLight = ip.nextLine();

        if(trafficLight.equalsIgnoreCase("Red")) {
            System.out.printf("Traffic light is %s so you should Stop!",trafficLight);
        }
        else if(trafficLight.equalsIgnoreCase("Yellow")) {
            System.out.printf("Traffic light is %s so you should get ready to go!",trafficLight);
        }
        else {
            System.out.printf("Traffic light is %s so you should GO!",trafficLight);
        }
    }
}  */


// In some cities, cars with even numbers can park on even dates and odd numbers on odd dates. Write a program that takes a car’s number plate last digit and today’s date, and tells whether the car can park.

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the last 4 digits of your car no. plate: ");
//         int carNum = ip.nextInt();
//         System.out.println("Enter todays date in dd format only: ");
//         int date = ip.nextInt();

//         if(carNum % 2 == 0 && date % 2 == 0) {
//             System.out.printf("You can park your car today as todays date is %d & your car no is %d as it is even number",carNum,date);
//         }
//         else {
//             System.out.printf("You can park your car today as todays date is %d & your car no is %d as it is odd number",carNum,date);
//         }
//     }
// }


/** A restaurant gives:

10% discount if the bill is above ₹500,

20% discount if the bill is above ₹1000,

Otherwise no discount.
Write a program that calculates the final bill. */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args){
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter your bill amount: ");
//         int bill = ip.nextInt();
        

//         if(bill >= 500 && bill < 1000) {
//             System.out.printf("Your total bill was %d\n",bill);
//             System.out.println("You get a 10% discount and final bill is "+(bill*0.1));
//             System.out.println("Total bill after discount = "+ (bill-(bill*0.1)));
//         }
//         else if(bill >= 1000) {
//             System.out.printf("Your total bill was %d\n",bill);
//             System.out.println("You get a 20% discount and final bill is "+(bill*0.2));
//             System.out.println("Total bill after discount = "+ (bill-(bill*0.2)));
//         }
//         else {
//             System.out.println("You get no Discounts!");
//         }
//     }
// }


/** Write a program that takes a student’s marks (0–100) and outputs their grade:

A: 90+

B: 75–89

C: 50–74

D: 35–49

F: <35 */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter your marks: ");
//         int marks = ip.nextInt();

//         if (marks >= 90 && marks <= 100) {
//             System.out.println("You got \"A\" grade.");
//         } else if (marks >= 75 && marks <= 89) {
//             System.out.println("You got \"B\" grade.");
//         } else if (marks >= 50 && marks <= 74) {
//             System.out.println("You got \"C\" grade");
//         } else if (marks >= 35 && marks <= 49) {
//             System.out.println("You got \"D\" grade.");
//         } else if (marks >= 0 && marks < 35) {
//             System.out.println("You got \"F\" grade.");
//         } else {
//             System.out.println("Enter correct marks!");
//         }
//     }
// }


/** A shopping site delivers products:

Free delivery if the cart value ≥ ₹2000

₹50 delivery charge if the cart value is between ₹500–1999

Not eligible if cart < ₹500
Write a program to calculate the total cost. */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the amount of cart: ");
//         int cart = ip.nextInt();

//         if(cart >= 2000) {
//                 System.out.println("You got free delivery");
//         }
//         else if(cart >= 500 && cart < 1999) {
//                 System.out.println("Your need to charge 50rs for delivery");
//                 System.out.println("Your total cart value is now: "+(cart+50));
//         }
//         else if(cart < 500) {
//             System.out.println("You are not eligible to make a cart.");
//         }
//         else {
//             System.out.println("Enter correct amount of cart.");
//         }

//     }
// }

// Write a program to check whether a number is negative, positive or zero

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         int num = ip.nextInt();


//         if(num < 0) {
//             System.out.format("The number %d is a negative number\n",num);
//         }
//         else if(num == 0) {
//             System.out.printf("The number %d is equal to zero\n",num);
//         }
//         else{
//             System.out.printf("The number %d is a positive number\n",num);
//         }
//     }
// }

// Write a program to input any alphabet and check whether it is vowel or consonant

// import java.util.Scanner;
// public class conditionals{
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter aplhabet: ");
//         char ch = ip.next().charAt(0);

//         if(ch == ('a') || ch == ('e') || ch == ('i') || ch == ('o') || ch == ('u') || ch == ('A') || ch == ('E') || ch == ('I') || ch == ('O') || ch == ('U')) {
//             System.out.printf("The alphabet \"%c\" is a vowel",ch);
//         }
//         else {
//             System.out.printf("The alphabet \"%c\" is not a vowel",ch);
//         }
//     }
// }



/** MATHEMATICAL QUESTIONS */

// Divisibility Check
// Input a number. Check if it is divisible by both 3 and 5, only 3, only 5, or neither.

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = ip.nextInt();

//         if(num % 3 == 0 && num % 5 == 0) {
//             System.out.printf("Number \"%d\" is divisible by both 3 and 5",num);
//         }
//         else if(num % 3 == 0) {
//             System.out.printf("Number \"%d\" is divisible by 3 only",num);
//         }
//         else if(num % 5 == 0) {
//             System.out.printf("Number \"%d\" is divisible by 5 only",num);
//         }
//         else {
//             System.out.printf("Number \"%d\" is neither divisible by 3 nor by 5",num);
//         }
//     }
// }


/** Electricity Bill Calculator

If units ≤ 100 → ₹5 per unit

101–200 → ₹7 per unit

200 → ₹10 per unit
Write a program to calculate the electricity bill based on input units. */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the units: ");
//         int unit = ip.nextInt();

//         if(unit <= 100) {
//             System.out.printf("You have used \"%d\" number of units this month\n",unit);
//             System.out.println("Per unit charge = 5rs");
//             System.out.printf("Total amount to be paid = \"%d\"\n",(unit * 5));
//         }
//         else if(unit >= 101 && unit < 200) {
//             System.out.printf("You have used \"%d\" number of units this month\n",unit);
//             System.out.println("Per unit charge = 7rs");
//             System.out.printf("Total amount to be paid = \"%d\"\n",(unit * 7));
//         }
//         else if(unit >= 200) {
//             System.out.printf("You have used \"%d\" number of units this month\n",unit);
//             System.out.println("Per unit charge = 10rs");
//             System.out.printf("Total amount to be paid = \"%d\"\n",(unit * 10));
//         }
//         else {
//             System.out.println("Enter the correct number of units");
//         }
//     }
// }

/** BMI Calculator
Input weight (kg) and height (m).

BMI < 18.5 → Underweight

18.5 ≤ BMI < 24.9 → Normal

25 ≤ BMI < 29.9 → Overweight

BMI ≥ 30 → Obese */

// import java.util.Scanner;

// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter your weight (kg): ");
//         int weight = ip.nextInt();
//         System.out.println("Enter your height (m): ");
//         int height = ip.nextInt();

//         int BMI = (weight/(height * height));

//         if(BMI < 18.5) {
//             System.out.printf("Your weight = %d & height = %d\n",weight,height);
//             System.out.printf("Your BMI = \"%d\", so you are Under weight stage\n",BMI);
//         }
//         else if(BMI >= 18.5 && BMI < 24.9) {
//             System.out.printf("Your weight = %d & height = %d\n",weight,height);
//             System.out.printf("Your BMI = \"%d\", so you are at Normal Stage\n",BMI);
//         }
//         else if(BMI > 25 && BMI < 29.9) {
//             System.out.printf("Your weight = %d & height  = %d\n",weight,height);
//             System.out.printf("Your BMI = \"%d\", so you are at Overweight stage\n",BMI);
//         }
//         else if(BMI >= 30) {
//             System.out.printf("Your weight = %d & height = %d\n",weight,height);
//             System.out.printf("Your BMI = \"%d\", so you are at Obese stage\n",BMI);
//         }
//         else {
//             System.out.println("Enter correct weight & height");
//         }
//     }
// }

/** ATM Cash Withdrawal
Ask for withdrawal amount.

Check if it is a multiple of 100.

Check if the balance is sufficient.

Deduct amount + ₹5 transaction charge if valid. */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the amount: ");
//         int amount = ip.nextInt();
//         int balance = 5000;

//         if(amount % 100 == 0) {
//             if(balance > amount) {
//                 System.out.printf("Amount to be withdrawn = %d\n",amount);
//                 System.out.println("Amount Deducting... with 5 rs extra charge");
//                 System.out.println("The total amount balance = "+(balance  - (amount + 5)));
//             }
//             else {
//                 System.out.println("Insufficient Balance!");
//             }
//         }
//         else {
//             System.out.println("Invalid amount! Please enter a multiple of 100.");
//         }
//     }
// }


/** Taxi Fare Calculator
Base fare = ₹50

Next 10 km = ₹10/km

Beyond 10 km = ₹15/km
Write a program to calculate the fare. */

// import java.util.Scanner;

// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the distance: ");
//         float distance = ip.nextFloat();

//         if(distance <= 10) {
//             System.out.printf("Total distance travelled = %.2fkm\n",distance);
//             System.out.printf("You have charged 10rs/km, in total = %.2frs\n", (50 + (distance * 10)));
//         }
//         else if(distance > 10) {
//             System.out.printf("Total distance travelled = %.2fkm\n",distance);
//             System.out.printf("You have charged 15rs/km, in total = %.2frs\n", (50 + (distance * 15)));
//         }
//         else {
//             System.out.println("Enter the correct distance");
//         }
//     }
// }

/** Speed Fine
If the speed of a car is:

≤60 → No fine

61–80 → ₹500 fine

80 → ₹2000 fine */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the car speed: ");
//         int carSpeed = ip.nextInt();

//         if(carSpeed <= 60) {
//             System.out.printf("Your car speed = %d\n",carSpeed);
//             System.out.println("You did not get any fine");
//         }
//         else if(carSpeed > 61 && carSpeed <= 80) {
//             System.out.printf("Your car speed = %d\n",carSpeed);
//             System.out.println("You have received a fine of 500rs");
//         }
//         else if(carSpeed > 80) {
//             System.out.format("Your car speed = %d\n",carSpeed);
//             System.out.println("You have received a fine of 2000rs");
//         }
//         else {
//             System.out.println("You are not drriving a car");
//         }
//     }
// }

// Write a program to input angles of a triangle and check whether triangle is valid or not

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter angle 1: ");
//         int angleA = ip.nextInt();
//         System.out.println("Enter angle 2: ");
//         int angleB = ip.nextInt();
//         System.out.println("Enter angle 3: ");
//         int angleC = ip.nextInt();

//         if((angleA + angleB + angleC) > 180) {
//             System.out.println("Triangle is invalid as the sum of total is > 180");
//         }
//         else if((angleA + angleB + angleC) < 180) {
//             System.out.println("Triangle is invalid as the sum of total is < 180");
//         }
//         else {
//             System.out.println("Triangle is valid as the sum of total is = 180");
//         }
//     }
// }

// Write a program to input all sides of a triangle and check whether triangle is valid or not

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter side 1: ");
//         int sideA = ip.nextInt();
//         System.out.println("Enter side 2: ");
//         int sideB = ip.nextInt();
//         System.out.println("Enter side 3: ");
//         int sideC = ip.nextInt();

//         if(((sideA + sideB) > sideC) &&  ((sideB + sideC) > sideA) && ((sideA + sideC) > sideB)) {
//             System.out.println("The triangle is valid");
//         }
//         else {
//             System.out.println("The tirangle is invalid");
//         }
//     }
// }

// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter length of side 1: ");
//         int sideA = ip.nextInt();
//         System.out.println("Enter length of side 2: ");
//         int sideB = ip.nextInt();
//         System.out.println("Enter length of side 3: ");
//         int sideC = ip.nextInt();

//         if((sideA == sideB) && (sideB == sideC) && (sideA == sideC)) {
//             System.out.println("The triangle is an equilateral triangle");
//         }
//         else if((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
//             System.out.println("The triangle is an isosceles triangle");
//         }
//         else if((sideA != sideB) && (sideB != sideC) && (sideA != sideC)) {
//             System.out.println("The triangle is an scalene triangle");
//         }
//     }
// }


// Next Level Questions

/** 1. 📆 Days in a Month

Input a month number (1–12) and a year.

Print how many days that month has.

Handle leap year for February correctly. */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter year: ");
//         int year = ip.nextInt();
//         System.out.println("Enter the month(eg:- 1-12): ");
//         int month = ip.nextInt();

//         switch (month) {
//             case 1 : {
//                 System.out.println("January has 31 days");
//                 break;
//             }
//             case 2 : {
//                 if(year % 4 == 0) {
//                     System.out.format("%d is a leap year, so February has 29 days",year);
//                  }
//                 else {
//                     System.out.format("%d is not a leap year, so February has 28 days",year);
//                      }
//                 break;
//             }
//             case 3 : {
//                 System.out.println("March has 31 days");
//                 break;
//             }
//             case 4 : {
//                 System.out.println("April has 30 days");
//                 break;
//             }
//             case 5 : {
//                 System.out.println("May has 31 days");
//                 break;
//             }
//             case 6 : {
//                 System.out.println("June has 30 days");
//                 break;
//             }
//             case 7 : {
//                 System.out.println("July has 31 days");
//                 break;
//             }
//             case 8 : {
//                 System.out.println("August has 31 days");
//                 break;
//             }
//             case 9 : {
//                 System.out.println("September has 30 days");
//                 break;
//             }
//             case 10 : {
//                 System.out.println("October has 31 days");
//                 break;
//             }
//             case 11 : {
//                 System.out.println("November has 30 days");
//                 break;
//             }
//             case 12 : {
//                 System.out.println("December has 31 days");
//                 break;
//             }
//             default : {
//                 System.out.println("enter valid month number");
//             }
    
//         }
//     }
// }

/** 🎓 University Admission Criteria

A student is eligible for admission if:

Physics ≥ 55, Chemistry ≥ 50, Math ≥ 65

OR (Total of Physics + Chemistry + Math ≥ 180)
Check if a student qualifies. */

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter Physics marks: ");
//         int phyMarks = ip.nextInt();
//         System.out.println("Enter Chemistry marks: ");
//         int chemMarks = ip.nextInt();
//         System.out.println("Enter math marks: ");
//         int mathMarks = ip.nextInt();

//         int total = phyMarks + chemMarks + mathMarks;

//         if((phyMarks >= 55 && chemMarks >= 50 && mathMarks >= 65) || total >= 180) {
//             System.out.printf("You have received %d total marks\n",total);
//             System.out.println("You are qualified");
//         } 
//         else {
//             System.out.printf("You have received %d marks\n",total);
//             System.out.println("You are not qualified");
//         }
//     }
// }

/** 📱 Mobile Data Recharge

A telecom company offers plans:

₹199 → 1.5 GB/day for 28 days

₹249 → 2 GB/day for 28 days

₹299 → 3 GB/day for 28 days
Write a program that takes plan code and days used as input, then calculates total data consumed and whether it is within the plan or exceeded. */


/** Take runs scored by Team A and Team B and overs played.

If Team A > Team B → Team A wins

If Team B > Team A → Team B wins

If equal → Match Draw
Add a twist → if Team B’s run rate (runs/overs) > Team A’s run rate but scores are same, call it a Tie with Advantage for Team B.*/

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);

//         System.out.println("Enter first team name: ");
//         String nameA = ip.nextLine();
//         System.out.println("Enter first team score: ");
//         int scoreA = ip.nextInt();
//         System.out.println("Enter the number of overs played by first team: ");
//         float oversA = ip.nextFloat();

//         ip.nextLine();
  
//         System.out.println("Enter second team name: ");
//         String nameB = ip.nextLine();
//         System.out.println("Enter second team score: ");
//         int scoreB = ip.nextInt();
//         System.out.println("Enter the number of overs played by second team: ");
//         float oversB = ip.nextFloat();

//         float runrateA = scoreA/oversA;
//         float runrateB = scoreB/oversB;

//          if(runrateB > runrateA && scoreA == scoreB){
//                 System.out.printf("The runrate of team %s = %.1f is greater than the runrate of team %s = %.1f\n",nameB,runrateB,nameA,runrateA);
//                 System.out.println("There is a Tie in a match");
//                 System.out.println("Also the team B gets advantage because of its high score");
//         }

//         else if(runrateA > runrateB && scoreA == scoreB) {
//             System.out.printf("The runrate of team %s = %.1f is greater than the runrate of team %s = %.1f\n",nameA,runrateA,nameB,runrateB);
//             System.out.println("There is a Tie in a match");
//             System.out.println("Also the team B gets advantage because of its high score");
//         }
//         else{

//         if(scoreA > scoreB) {
           
//             System.out.printf("Team name = %s\n",nameA);
//             System.out.printf("Team %s has scored %d runs in %.2f overs\n",nameA,scoreA,oversA);
//             System.out.printf("Team \"%s\" wins\n",nameA);
//             } 
//         else if(scoreB > scoreA) {
            
//             System.out.printf("Team name = %s\n",nameB);
//             System.out.printf("Team %s has scored %d runs in %.2f overs\n",nameB,scoreB,oversB);
//             System.out.printf("Team \"%s\" wins\n",nameB);
//         } 
            
//         else {
//             System.out.println("The match draws!");
//         }
//     }
//     }
// }

// while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100. If quantity and price per item are input through the keyboard, write a program to calculate the total expenses.

// import java.util.Scanner;
// public class conditionals {
//     public static void main(String []args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Enter the number of Items purchased: ");
//         int items = ip.nextInt();
//         System.out.println("Enter the Price Per Item: ");
//         float price = ip.nextFloat();

//         if(items > 100) {
//             System.out.println("The Quantity of Items Purchased = "+(items));
//             System.out.println("The Total Price = "+(items*price));
//             System.out.printf("The Price of each Item = %.2f\n",(items/price));
//             System.out.println("10% discount applied on "+ items + " items");
//             System.out.println("Total Price after discount = "+((items*price)-((items*price)*0.1)));
//         }
//         else {
//             System.out.println("The Quantity of Items Purchased = "+(items));
//             System.out.println("The Total Price = "+(items*price));
//             System.out.printf("The Price of each Item = %.2f\n",(items/price));
//             System.out.println("You did not get any discounts");
//         }

//     }
// }

// ROCK, PAPER, SCISSOR GAME

// import java.util.Random;
// import java.util.Scanner;

// public class conditionals {
//     public static void main(String []args) {
//         Random random = new Random();
//         int rand = random.nextInt(3);
//         Scanner ip = new Scanner(System.in);
//         System.out.println("ROCK PAPER SCISSOR");
//         System.out.println("Enter your name: ");
//         String name = ip.nextLine();
//         System.out.println("Rock [1]");
//         System.out.println("Paper [2]");
//         System.out.println("Scissor [3]");
//         int num = ip.nextInt();
//         String userRes,programRes;

//         if(num == 1) {
//            userRes = "Rock"; 
//         }
//         else if(num == 2) {
//            userRes = "Paper";
//         }
//         else {
//             userRes = "Scissor";
//         }
//         System.out.printf("%s = %s\n",name,userRes);

        
//         if(rand == 1) {
//             programRes = "Rock";
//         }
//         else if(rand == 2){
     
//             programRes = "Paper";
//         }
//         else {
        
//             programRes = "Scissor";
//         }
//         System.out.printf("Program = %s\n",programRes);

//         if((num == 1 && rand == 3) || (num == 2 && rand == 1) || (num == 3 && rand == 2)) {
//             System.out.printf("%s Wins",name);
            
//         } 
//         else if((rand == 1 && num == 3) || (rand == 2 && num == 1) || (rand == 3 && num == 2)){
//             System.out.println("Program Wins");
            
//         }
//         else {
//             System.out.println("Match Draw!");
//         }

        

        
//     }
// }

