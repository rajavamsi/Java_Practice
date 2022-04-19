import java.util.Scanner;  
public class ProOFDig  
{  
public static void main(String args[])  
{  
int number, digit, pro = 1;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
{  
    
digit = number % 10;  

pro = pro * digit;  

number = number / 10;  
}  
  
System.out.println("Product of Digits: "+pro);  
}  
}  