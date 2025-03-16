
public class class27 {
    public static void main(String args[]){
                   Customer Rahul = new Customer(01,"rahul kumar","63462" );
                //    Rahul.setName("rahul kumar");
                //    Rahul.settercId(01);
                //    Rahul.setNum(23759);
                //    Rahul.mobile  = "620******";
                   Rahul.getdata();
    }
    
}
class Customer{
    private int cId;
    private String cName ;
    private int cNum;
    public String  mobile;
  public  Customer(cid, cName , mobile){
    this();
        this.cId = cid;
        this.cName = cName;
        this.mobile = mobile;
    }
    //  public void settercId(int id){
    //     this.cId = id; 
    //  }
    //  public void setName(String name){
    //     this.cName = name; 
    //  }
    //  public void setNum(int cNum){
    //     this.cNum = cNum; 
    //  }

     void getdata(){
        System.out.println("the cid is :"+cId);
        System.out.println("the customer Name is :"+cName);
        System.out.println("the customer no  is :"+cNum);
        System.out.println("the customer mob no   is :"+mobile);
     }
}
