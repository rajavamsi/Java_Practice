import java.util.Scanner;
class ArrayEvenSum
  {
    public static void main(String args[])
    {
      int sum=0;
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      //Reading values
      System.out.println("Enter array elements");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      //Displaying even numbers
      System.out.println("Even Array elements sum is");
      for(int i=0;i<5;i++)
        {
          if(a[i]%2==0)
          {
            sum=sum+a[i];
          }
        }
      System.out.println(sum);
    }
  }