package revision;

public class Prime {
    public static void main(String[] args){
        // int n = 345; -> false;
        // int n = 777;-> false;
        int n = 913; // -> false 
        boolean check = isprime(n);
        System.out.println(check);

    }

    // prime function 
    static boolean isprime(int val){
        for(int i=2;i<val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;

    }
    
}
