/*  JFM1T2_Assignment7:

     Assume that the integer variable a is 20 and b is 10. Evaluate the following expressions and print the value of resultant variable:
     1. int b= a-- - --a;
     2. int c=a--;
     3. int d=a>>2;
     4. int e=a&b;
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter a value: 
     20
     Enter b value: 
     10
     
     Expected Output:
     a-- - --a is: 2
     a-- is: 18
     a>>2 is: 4
     a&b is: 0
*/

import java.util.Scanner;
public class Expression {
     //main method
     public static void main(String[] args) {  
          //Use the scanner class to provide input at execution time using scanner object
          Scanner sc=new Scanner(System.in);
          int a,b,c,d,e,k;
          System.out.println("Enter a value: ");
          a=sc.nextInt();
          System.out.println("Enter b value: ");
          b=sc.nextInt();
          //print appropriate result for Expression operators
          k=a-- - --a;
          System.out.println("the a-- - --a is: "+k);
          c=a--;
          System.out.println("the a-- is: "+c);
          d=a>>2;
          System.out.println("the  a>>2: "+d);
          e=a&b;
          System.out.println("the a&b: "+e);
     }
}



//Good Job................
//Please maintain comments in your code which were given with question..
////Please follow indentation..

