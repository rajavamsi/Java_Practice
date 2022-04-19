/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber 
{
  //Add main method
    public static void main(String args[])
  {
    //Declare the three variables
    int a,b,c;
    System.out.println("Enter three numbers");
    //Use the scanner class to provide input at execution time
     Scanner s= new Scanner(System.in);
    System.out.println("Enter the first number");
     a=sc.nextInt();
    System.out.println("Enter the Second number");
     b=sc.nextInt();
    System.out.println("Enter the third number");
     c=sc.nextInt();
    //check which number is highest using if else condition
    if(a>b)
    {
      if(a>c)
      {
        System.out.println("A is big");
      }
      else
      {
        System.out.println("C is big");
      }
      else
    {
      if(b>c)
      {
        System.out.println("B is big");
      }
        else
      {
        System.out.println("C is big");
      }
    }
    }
    }
    
    







//Print the highest of three numbers
    }
}