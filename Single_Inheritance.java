class Animal
  {
    String color;
    void eat()
    {
      System.out.println("Eating");
    }
  }
class Dog extends Animal
  {
    String bread;
    void bark()
    {
      System.out.println("Barking");
    }
  }
class Single_Inheritance
  {
    public static void main(String args[])
    {
      Dog d=new Dog();
      d.color="White";
      d.bread="German";
      System.out.println(d.color+" "+d.bread);
      d.eat();
      d.bark();
    }
    
  }