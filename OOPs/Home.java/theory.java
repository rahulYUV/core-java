// oops => object oriented programming is a computer programmin model that organisze software design aroudn data or object , rahter than function or logic
// an oobs can be deifen a s a dra fiel tha has unique attributes and behaicoru 
/// as the name suggest oops aims to implememtn realword wntities oops aioma to implement real wordk entitites like inheritence hiding m, o
/// //polumorphism etec 
/// 
/// 
/// 
/// 

// object and class 
// setter and getter 

public class theory {
    public static void main(String[] args) {
                    //    ac remote  = new ac();
                    //    System.out.println(remote.getter());// op is null 
                    //     remote.setter("30.deg");
                    //     System.out.println("the op is "+remote.getter());// expected op is the temp is 30.0 deg
                        // Bank SBI = new Bank();
                        // SBI.set(346346,71545 );
                        // SBI.get();

                        // 
                        HDFC user = new HDFC(2349057,7584);
                        
                        user.getAccountPin();
                        user.getAccountNO();
    }
}
class ac {
   // encapusualtion code 
    private String coolenet ;
   void setter(String value){
           coolenet = value;

    }
      String getter(){
            return coolenet;
    }
        // what is encapsulation 

}

class Bank{
    private int accountNumber ;
    private int pin;
            void setAccountPin(int accNO , int pin){
                   this.accountNumber = accNO;
                    this.pin = pin;
            }
            void getAccountPin(){
                System.out.println("the account NO is "+accountNumber);
                System.out.println("the pin is: "+pin+"*****");
            }
}

// what is shadowing problem 
// to overcome thi use this keyword

// contructor -> 
// he is a setter that dosent have any reurn type 
// calleed during object creation  

//new HDFC(454234985,3458);
// be disciplined 
// be with java , and java with you 
// java is my bestFreind 
// java will feed my stomach 
// i spend aa quality of time 
// we should spend minimum 4 hours with java 
// assignment 1 => 
/*
 * customer class c_id , c_name , cNum 
 * crate getter three 
 * // later use and setter 
 * // later user constructor 
 * 
 * 
 * focus on should be work and skill 
 * the result is byProduct 
 * life is uncertain 
 * trust the process 
 * 
 * 
 * 
 * chinease bamboo plant
 * 
 */

class HDFC{
        int accountNO , pin;
        public HDFC(int accountNO , int pin){
            this.accountNO = accountNO;
            this.pin = pin;


        }
      public int getAccountPin(){
            System.out.println(pin+"this is the pin");
            return pin;

       }
      public int getAccountNO(){
        System.out.println(accountNO+"this is the pin");
        return accountNO;
       }
};