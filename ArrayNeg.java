import java.util.Scanner;
class ArrayNeg
  {
    public static void main(String args[])
    {
      int a[]=new int[5];
      Scanner sc=new Scanner(System.in);
      //Reading values
      System.out.println("Enter array elements");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      //Displaying even numbers
      System.out.println("Negative Array elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]<0)
          System.out.println(a[i]);
        }
    }
  }