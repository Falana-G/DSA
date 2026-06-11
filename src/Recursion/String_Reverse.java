package Recursion;

public class String_Reverse {
    static void main(String[] args) {
        String str = "ABCDEF";
        System.out.println(rev(str, str.length()-1));
    }
    public static String rev(String str, int i){
        if(i<0){
            return "";
        }
        char ch = str.charAt(i);
        return ch+rev(str, i-1);
    }
}
