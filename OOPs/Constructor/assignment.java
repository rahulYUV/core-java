import java.util.Scanner;

public class assignment {
    /*
     * Default Constructor:

Write a Java program to create a class Car with a default constructor that prints "Car object created".

     */

     public static void main(String args[]){
               //     car scorpio =  new car();
               //      Student rahul = new Student("rahul kumar",19);
               //   Rectangle withoutargument=    new Rectangle();       
               //   withoutargument.getData();  
               //   Rectangle withoutargumentt=    new Rectangle(15,35);       
               //   withoutargumentt.getData();   
                        Scanner scc =   new Scanner(System.in);
                    //     System.out.println("enter the name");
                    //     String name = scc.nextLine();
                    //     int age = scc.nextInt();


                    //         Person alex =  new Person(name,age);
                    //         alex.getData();

                                   Grade Rohan =new Grade();
                  
     }
}
class car{
     car(){
        System.out.println("car object created");
     }
}
/*
 * Parameterized Constructor:

Create a Student class with a constructor that accepts name and age as parameters and initializes them.
 */
class Student{
          private String sName ;
          private int sAge ;
          Student(String name , int age){
               this.sName = name;
               this.sAge = age;
               System.out.println("object is initilized");
          }
          
};

/*
 * Multiple Constructors (Overloading):

Write a Rectangle class with:
A default constructor that sets length=1, width=1.
A parameterized constructor that accepts length and width.
A method area() to calculate and return the area.
 */

 class Rectangle{
     private int length ;
     private int  width ;
     Scanner scc = new Scanner(System.in);
     Rectangle(){
          length = 1;
          width = 1;
     }
     Rectangle(int length , int width){
          this.length = length ;
          this.width = width;
     }
     void getData(){
          System.out.println("The length is: "+length);
          System.out.println("The width is: "+width);
     }
     
 }

 /*
  * Multiple Constructors (Overloading):
Constructor with Input from User:

Create a Person class where the constructor takes name and age as input from the user using Scanner.

  */

  class Person{
    private int age ;
    private String name ;
    Person(String name,int age ){
     this.age= age;
     this.name = name ;

    }
    void getData(){

     System.out.println("this is age"+this.age+" this is name "+this.name);
    }

  }


  /*
   * Student Grade Calculation:
Create a Student class where the constructor accepts marks for 3 subjects.
Calculate and display the total and percentage.


     

   */
  class Grade{
     private int marks1;
     private int marks2;
     private int marks3;
     Grade(){
          System.out.println("enter the first marks");
          this.marks1=scc.nextInt();
          System.out.println("enter the Second marks");
          this.marks2=scc.nextInt();
          System.out.println("enter the third marks");
          this.marks3=scc.nextInt();
     int avg = (marks1+marks2+marks3)/3;
     System.out.println(avg+"this is average ");
     
     }
  }