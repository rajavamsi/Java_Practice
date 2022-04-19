/*
  JFM1T4_Assignment2:
  Write a program to display the name of the day, based on the number, using the switch statement.
  Prompt the user to input a number between 1 and 7. 
  
  Sample Input: 1
  
  Expected Output: Monday
  
*/


//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;
class DisplayDay
  {
    public static void main(String args[])
    {
      //declare number variable
      int n;
      System.out.println("Enter the value ");
      //Use the scanner class to provide input at execution time using scanner object
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     
      if(n==1)
        System.out.println("Monday");
      else if(n==2)
         System.out.println("Tuesday");
      else if(n==3)
         System.out.println("Wednesday");
      else if(n==4)
         System.out.println("Thursday");
      else if(n==5)
         System.out.println("Friday");
      else if(n==6)
         System.out.println("Saturday");
      else if(n==7)
         System.out.println("Sunday");
         /*
Take input of the number for displaying day
System.out.println("Enter value for displaying day:");
number=sc.nextInt();
*/
      else
      
         System.out.println("Enter a value between 1 to 7");
         
    }
  }