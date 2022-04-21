import java.util.Scanner;
class ArrayNegCount
  {
    public static void main(String args[])
    {
      int count=0;
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      //Reading values
      System.out.println("Enter array elements");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      //Displaying even numbers
      System.out.println("Total Negative Array elements are");
      for(int i=0;i<5;i++)
        {
          if(a[i]<0)
          {
          count++;
          }
        }
      System.out.println(count);
    }
  }