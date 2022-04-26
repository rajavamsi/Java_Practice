class Student
  {
    String name;
    int Id;
    String branch;
    public static void main(String args[])
    {
      Student st1=new Student();
      st1.name="Raja Vamsi";
      st1.Id=40;
      st1.branch="EC";
      Student st2=new Student();
      st2.name="Vamsi";
      st2.Id=50;
      st2.branch="EC";
      Student st3=new Student();
      st3.name="Raj";
      st3.Id=60;
      st3.branch="EC";
      System.out.println(st1.name+" "+st1.Id+" "+st1.branch);
      System.out.println(st2.name+" "+st2.Id+" "+st2.branch);
      System.out.println(st3.name+" "+st3.Id+" "+st3.branch);
    }
    
}   
  