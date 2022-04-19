import java.util.Scanner;
  class Vote
    {
      public static void main(String args[])
      {
        int n;
        System.out.println("Enter age");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>=18)
        {
          System.out.println("Eligible for voting");
        }
        else
        {
          System.out.println("Not Eligible for voting");
        }
        
      }
    }