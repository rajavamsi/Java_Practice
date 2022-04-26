/* JFM1T7_Assignment1:

   Write a program to initialize data members of Student class using constructor.
   Prompt the user for the  values to be input from the terminal

   Sample Input:
   Enter student name: Shree Balaji
   Enter student Roll no: 01

   Expected Output:
   Name: Shree Balaji    Roll no: 01

*/

import java.util.Scanner;
public class StudentConstructor {
    //main method
    public static void main(String[] args) {
        //initializing student class using constructor
        //Scanner is used to read inpit form users
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name = sc.nextLine();
        System.out.print("Enter Student Rollno : ");
        int rollNum = sc.nextInt();
        //get student name and rollno form user and set it to the student object
        Student2 s = new Student2(rollNum, name);
        System.out.print("Student Name : "+s.getName());
        System.out.print("  ");
        System.out.print("RollNumber : "+s.getRollno());
    }
    
}
class Student2 {
    int rollNo;
    String name;
    Student2(int rollno, String name){
        this.rollNo = rollno;
        this.name = name;
    }
    //adding setter method for rollno
    public void setRollno(int rollNum) {
        this.rollNo = rollNum;
    }
    //adding getter method for rollno
    public int getRollno() {
        return this.rollNo;
    }
    //adding setters and getters for names
    public void setName(String sname) {
        this.name = sname;
    }
    public String getName() {
        return this.name;
    }
}



