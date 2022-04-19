import java.util.Scanner;
  class Pn
    {
      public static void main(String args[])
      {
        int n;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        {
          System.out.println("The given number is Positive");
        }
        else
        {
          System.out.println("The given number is Negative");
        }
        
      }
    }