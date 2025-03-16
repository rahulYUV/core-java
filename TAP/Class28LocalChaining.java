import java.util.Scanner;

// local chining continue 
public class Class28LocalChaining {
    public static void main(String args){
                // convention 
                 // pascal 
                  // camelaCase 
                   // snakae 
                   // kebab-case-convetnion it is error in java and used in css 
                //    Encapsulation programming

               Scanner scan = new Scanner(System.in);
            System.out.println("Enter teh ID");
            int id = scan.nextInt();
            System.out.println("enter the name");
            String name = scan.nextLine();
            System.out.println("enter the salary");
            int sallary = scan.nextInt();
            System.out.println("enter the email");
            String email= scan.next();


            System.out.print(id+" "+"name"+name+"sallary"+sallary+"email"+email);



    }
}
class Employee{
    private int id;
    private String name ;
    private int sallary;
    private String email;

    Employee(){

    }
    Employee(int id , String name , int sallay,String email){
        this.id = id;
        this.name = name;

        this.sallary = sallary;
        this.email = email;

 
    } 
    void setId( int id){
        this.id= id;

    }
    void setName( String name){
        this.name = name;

    }
    void settSallary( int sallary){
        this.sallary = sallary;
    }
    void setEmail(String email){
            this.email = email;
    }
   void getData(){
    System.out.println(id+""+name+""+sallary+""+email);
   }
}
