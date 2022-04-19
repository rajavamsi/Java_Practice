import java.util.Scanner;
class WhileFLSum
  {
    public static void main(String args[])
    {
      int num,sum;
      System.out.println("Enter a number");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      int fd=0;
      int ld=0;
      ld=num%10;
      System.out.println("Last digit is "+ld);
      while(num!=0)
        {
          fd=num%10;
          num /=10;
        }
      System.out.println("First digit is "+fd);
      sum=ld+fd;
      System.out.println("Sum is "+sum);
    }
  }