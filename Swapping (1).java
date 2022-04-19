/*  JFM1T2_Assignment6:

    Write a program that swaps the values of 2 variables without using third variable.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    12
    Enter second number: 
    45
    
    Expected Output:
    Before swapping: 12 , 45
    After swapping: 45 , 12
*/

import java.util.Scanner;
public class Swapping {
//main method
  public static void main(String[] args) {  
       int x, y;// x and y are to swap   
       // Use the scanner class to provide input at execution time using scanner object
       Scanner sc = new Scanner(System.in);  
       // Take input from user
         System.out.println("Enter first number: ");
         x=sc.nextInt();
          System.out.println("Enter second number: ");
          y=sc.nextInt();
       System.out.println("Before swapping: "+x +" , "+y);  
       //swapping two numbers without using third variable
       x=x+y;
       y=x-y;
       x=x-y;
       //print result
       System.out.println("After swapping: "+x +" , "+y);     
   }
}

//Good Job................
//Please maintain comments in your code which were given with question..
////Please follow indentation..
