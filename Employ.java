class Employ
  {
    String name;
    int Id;
    long sal;
    String dept;
    public static void main(String args[])
    {
      Employ emp1=new Employ();
      emp1.name="Raja Vamsi";
      emp1.Id=40;
      emp1.sal=25000;
      emp1.dept="Developer";
      Employ emp2=new Employ();
      emp2.name="Vamsi";
      emp2.Id=50;
      emp2.sal=30000;
      emp2.dept="Trainee";
      Employ emp3=new Employ();
      emp3.name="Vamsi";
      emp3.Id=50;
      emp3.sal=30000;
      emp3.dept="Trainee";
      System.out.println(emp1.name+" "+emp1.Id+" "+emp1.sal+" "+emp1.dept);
      System.out.println(emp2.name+" "+emp2.Id+" "+emp2.sal+" "+emp2.dept);
      System.out.println(emp3.name+" "+emp3.Id+" "+emp3.sal+" "+emp3.dept);
     
    }
    
}