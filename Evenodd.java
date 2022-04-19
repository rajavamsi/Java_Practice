import java.util.Scanner;
  class Evenodd
    {
      public static void main(String args[])
      {
        int n;
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        {
          System.out.println("The given number is even");
        }
        else
        {
          System.out.println("The given number is odd");
        }
        
      }
    }