/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;
 class GroceryItems
{
//Define the main method
   public static void main(String args[])
  {
//Declare and initialize variables
    double max;
//Take the 10 different expenses price
     Scanner sc=new Scanner(System.in);
     double a[]=new double[10];
     max=a[0];
//Check the 10 different expenses price using for loop
    System.out.println("enter expenses:");
     for(int i=0;i<10;i++)
       {
        a[i]=sc.nextDouble();
       }
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
      for(int i=0;i<10;i++)
        {
          if(a[i]>max)
          {
            max=a[i];
          }
        }
//Print the result
    System.out.println("The highest price you incurred is "+max);  
  }
}
