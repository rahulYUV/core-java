package Searching;

public class linearString {
    public static void main(String args[]){
        String name = "Mushak";
        System.out.println(Ss(name,'u'));
    }
    static boolean Ss(String str , char c){
        for(int i=0;i<str.length();i++){
                if(str.charAt(i)==c){
                    return true;

                }
                return false;

        }

    }
}
