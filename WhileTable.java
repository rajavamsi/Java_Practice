import java.util.Scanner;
class WhileTable
  {
    public static void main(String args[])
    {
      int n,i=1,mul;
      System.out.println("Enter a number");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=10)
        {
          mul=n*i;
          
          System.out.println(n+"*"+i+"="+mul);
          i++;
        }
      
    }
    
 
    
  }