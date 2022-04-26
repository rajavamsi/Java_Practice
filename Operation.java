import java.util.*;
class ATM
  {
    int balance;
    //withdraw
    void withdraw(int amt)
    {
      if(balance>amt)
      {
        balance=balance-amt;
        System.out.println("Withdrawl Success");
      }
      else
      {
        System.out.println("Insufficient funds");
      }
    }
    //deposit
    void deposit(int amt)
    {
      balance=balance+amt;
      System.out.println("Deposit success");
    }
    //Balance
    void checkBalance()
    {
      System.out.println(balance);
    }
  }
    class Operation
      {
        public static void main(String args[])
        {
          Scanner sc=new Scanner(System.in);
          ATM atm=new ATM();
          
          atm.balance=10000;
          char ch='y';
          do
            {
              System.out.println("Choose an option");
              System.out.println("1.Withdrw\n2.Deposit\n3.Check balance");
              int option=sc.nextInt();
              switch(option)
                {
                  case 1:
                    System.out.println("Enter amount");
                    int amount=sc.nextInt();
                    atm.withdraw(amount);
                    break;
                    case 2:
                    System.out.println("Enter amount");
                    int amount1=sc.nextInt();
                    atm.deposit(amount1);
                    break;
                    case 3 :
                    atm.checkBalance();
                    break;
                  default:
                    System.out.println("Invalid operation");
                } 
              System.out.println("Do you want to continue");
              ch=sc.next().charAt(0);
              }
              while(ch=='y');
              
            }
      }
      
  