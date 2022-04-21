/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;  
public class PrimeNumbers  {
   public static void main(String[] args) {  
       Scanner sc= new Scanner(System.in);  
       System.out.print("Enter the starting number : ");  
       int start = sc.nextInt();  
       System.out.print("Enter the ending number : ");  
       int end = sc.nextInt();  
       System.out.println("List of prime numbers between " + start + " and " + end);  
       for (int i = start; i<= end; i++) {  
           if (isPrime(i)) {  
               System.out.println(i);  
           }  
       }  
   }  
     public static boolean isPrime(int n) {
       if (n <= 1) {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) {  
           if (n % i == 0) {  
               return false;  
           }  
       }  
       return true;  
   }  
}
    
    












/*Inside the loop, check if the number can be divided by other numbers. You will need another loop for this.
  If it is divisble by other numbers (except 1 and itself), then move on to check the next number
  Else, print the prime number and then move on to the next number
*/
 
    }
}