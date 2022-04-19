class ForEo
  {
    public static void main(String args[])
    {
      int i;
      System.out.println("Even numbers are ");
      for(i=1;i<=10;i++)
        {
          if(i%2==0)
          System.out.println(i);
        }
      System.out.println("Odd numbers are ");
      for(i=1;i<=10;i++)
        {
          if(i%2!=0)
          System.out.println(i);
        }
    }
  }