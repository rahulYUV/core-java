import java.util.*;

public class class27 {
    public static void main(String args[]){

                        Scanner sc = new Scanner(System.in);
                        Customer Rahul = new Customer();
                        System.out.println("enter the details cId , cName , cNum ");
                      String data = sc.nextLine(); 
                        System.out.println(data);
                      String data[]= data.split(",");
                      System.out.println(
                        Arrays.toString(data);
                      )
                                                        }
                       
                  
    }
    

class Customer{
    private int cId;
    private String cName ;
    private int cNum;
    public String  mobile;
    public Customer(){

    }
  public  Customer(int cid, String cName , int mobile){
    
        this.cId = cid;
        this.cName = cName;
        // this.mobile = mobile;
    }
     public void settercId(int id){
        this.cId = id; 
     }
     public void setName(String name){
        this.cName = name; 
     }
     public void setNum(int cNum){
        this.cNum = cNum; 
     }

     void getdata(){
        System.out.println("the cid is :"+cId);
        System.out.println("the customer Name is :"+cName);
        System.out.println("the customer no  is :"+cNum);
        System.out.println("the customer mob no   is :"+mobile);
     }
}
