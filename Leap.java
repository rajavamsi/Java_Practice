import java.util.Scanner;
  class Leap
    {
      public static void main(String args[])
      {
        int n;
        System.out.println("Enter year");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0)
        {
          System.out.println("It is a leap year");
        }
        else
        {
          System.out.println("It is not a leap year");
        }
        
      }
    }