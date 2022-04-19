import java.util.Scanner;
class WhileNum1
  {
    public static void main(String args[])
    {
      long n,i=1;
      System.out.println("Enter n value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      
      while(n>=i)
        {
          System.out.println(n);
          n--;
        }
      
    }
  }