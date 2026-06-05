package Strings;

public class DeleteDuplicates {
    static void main(String[] args) {
        String ss = "SSShee issss ggoooiiiing tto Mmarrkeeet";
        String s = dup(ss);
        System.out.println(s);
    }

    static String dup(String ss){
        StringBuffer s = new StringBuffer(ss); // String is Immutable

        for (int i = 0; i < s.length()-1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i+1);
            if(ch1 == ch2){
                s.delete(i,i+1);
                i--;
            }
        }

        String str = s.toString();
        return str;
    }
}
