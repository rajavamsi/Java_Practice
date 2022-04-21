import java.util.Scanner;
class ArrayMinValue
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
      int min=a[0];
      System.out.println("Minimum of array elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]<min)
          {
          min=a[i];
          }
        }
      System.out.println(min);
    }
    
  }