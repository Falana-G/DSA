package Recursion;

public class String_Reverse {
    static void main(String[] args) {
        String str = "ABCDEF";
        String ans = "";
        System.out.println(Headrev(str, str.length()-1));
        Tailrev(str, str.length()-1, ans);
    }
    public static String Headrev(String str, int i){
        if(i<0){
            return "";
        }
        char ch = str.charAt(i);
        return ch+Headrev(str, i-1);
    }
    public static void Tailrev(String str, int i, String ans){
        if(i<0){
            System.out.println(ans);
        }
        else{
            ans = ans + str.charAt(i);
            Tailrev(str, i-1, ans);
        }
    }
}
