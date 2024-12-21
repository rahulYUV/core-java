
public class shadow {
    static int x =90;// it is global variable 

    //static mean object independent;
                // it can use without crating as object ;


        public static void main(String args[]){
          //  shadow-> pratice of using thw two vvariable using a same name  
          System.out.println(x);
          int x =40;// shadow the previous value of x;
          
          System.out.println(x);
         
            

        }
}
