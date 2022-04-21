import java.util.Scanner;
class ArrayMaxValue
  {
    public static void main(String args[])
    {
      int a[]=new int[5];
      int min=0;
      Scanner sc=new Scanner(System.in);
      //Reading values
      System.out.println("Enter array elements");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextInt();
        }
      //Displaying even numbers
      System.out.println("Maximum of array elements");
      for(int i=0;i<5;i++)
        {
          if(a[i]>min)
          {
          min=a[i];
          }
        }
      System.out.println(min);
    }
    
  }