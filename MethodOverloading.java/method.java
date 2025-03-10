
public class method {
    public static void main(String[] args) {
            Calc calcu = new Calc(); 
            calcu.add();
            calcu.add(10,15);
            calcu.add(10,15.5);
    }
    
}
       
class Calc{
    // method alwys present inside class 
    void add(){
        System.out.println(100+200);
     }
     void add(int a , int b){
        System.out.println(a+b);
     }


    void  add(int a, double b){
        System.out.println(a+b);
     }

     
};