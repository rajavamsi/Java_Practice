import java.util.Scanner;
class Array2D
  {
    public static void main(String args[])
    {
      int a[][]=new int[3][2];
      System.out.println("Enter array elements");
      Scanner sc=new Scanner(System.in);
      for(int i=0;i<3;i++)
        {
          for(int j=0;j<2;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("array elements are");
      for(int i=0;i<3;i++)
        {
          for(int j=0;j<2;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }