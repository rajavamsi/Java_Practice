/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

import java.util.Scanner;
    public class SumWithoutPlus {
        //main method
        public static void main(String args[]){
         Scanner sc = new Scanner(System.in);  
        System.out.println("Enter frist number:");
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        while(b != 0){
          int carry = a & b;
          a = a ^ b;
          b= carry << 1;
        }
        System.out.println("The sum of two number is: "+a);
    }
}

//Good Job................
//Please maintain comments in your code which were given with question..
