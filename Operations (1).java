/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

import java.util.Scanner;

public class Operations {

//main method
public static void main(String[] args) {  
System.out.println("Enter first number: ");
int a=sc.nextInt();
System.out.println("Enter second number: ");
int b=sc.nextInt();

int  c= a-b;
System.out.println("Difference of 2 numbers: "+c);
int d = a*b;
System.out.println("Product of 2 numbers: "+c);
int e = a/b;
System.out.println("Division of 2 numbers: "+d);
int f = ++a;
System.out.println("Increment of 2 numbers: "+e);
int g = --a;
System.out.println("Decrement the number: "+f+" "+g);
int h = a%b;
System.out.println("Remainder of 2 numbers: "+h);
}
}
 

//Good Job................
//Please maintain comments in your code which were given with question..
////Please follow indentation..
