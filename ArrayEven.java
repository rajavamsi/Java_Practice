import java.util.Scanner;
class ArrayEven
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
      System.out.println("Even Array elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]%2==0)
          System.out.println(a[i]);
        }
    }
  }