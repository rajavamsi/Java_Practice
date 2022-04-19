import java.util.Scanner;
class WhileSum
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      System.out.println("Enter n value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
     System.out.println(sum);
    }
  }