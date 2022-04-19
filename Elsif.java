import java.util.Scanner;
class Elsif
  {
    public static void main(String args[])
    {
      char ch;
      System.out.println("Enter a character ");
      Scanner sc=new Scanner(System.in);
      ch=sc.next().charAt(0);
      if(ch=='a' || ch=='A')
        System.out.println(ch+ " is a vowel");
      else if(ch=='e'||ch=='E')
         System.out.println(ch+ " is a vowel");
      else if(ch=='i' || ch=='I')
         System.out.println(ch+ " is a vowel");
       else if(ch=='o' || ch=='O')
         System.out.println(ch+ " is a vowel");
       else if(ch=='u' || ch=='U')
         System.out.println(ch+ " is a vowel");
      
      else
      
         System.out.println(ch+ " is a consonent");
         
    }
  }