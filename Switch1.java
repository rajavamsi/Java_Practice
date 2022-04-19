import java.util.Scanner;
class Switch1
  {
    public static void main(String args[])
    {
      char n;
      System.out.println("Enter a value ");
      Scanner sc=new Scanner(System.in);
      n=sc.next().charAt(0);
      switch(n)
        {
          case 'a': case 'A':
          case 'e': case 'E':
          case 'i': case 'I':
          case 'o': case 'O':
          case 'u': case 'U':
         System.out.println("Vowel");
            break;
          default:
            System.out.println("Consonent");
            
        }
    }
  }