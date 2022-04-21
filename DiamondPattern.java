/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

 import java.util.Scanner;
class DiamondPattern {

//Add main method here
public static void main(String args[]){
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c
    String str="0abc";
   
   for (int i = 1; i <= 3; i++)
        {
            int n = 3;
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
            {
              System.out.print(" "+str.charAt(k));
            }
            for (int l = i-1; l >= 1; l--)
            {
              System.out.print(" "+str.charAt(l));
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--)
        {
            int n = 2;
            for (int j = 0; j <= n - i; j++)
            {
              System.out.print("  ");
            }
            for (int k = 1; k <= i; k++)
            {
              System.out.print(" "+str.charAt(k));
            }
            for (int l = i-1; l >= 1; l--)
            {
              System.out.print(" "+str.charAt(l));
            }
            System.out.println();
        }
}
}