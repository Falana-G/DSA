package Strings.Practice;

public class Valid_Palindrome_II {
    static void main(String[] args) {
        String str = "abca";
        Boolean tf = Check(str);
        System.out.println(tf);
    }

    public static boolean Check(String str){
        StringBuffer s1 = new StringBuffer(str);
        if(s1.toString().equals(s1.reverse().toString())){
            return true;
        }
        else{
            for (int i = 0; i < str.length(); i++) {
                StringBuffer sb = new StringBuffer(str);
                sb.delete(i,i+1);
                if(sb.toString().equals(sb.reverse().toString())){
                    return true;
                }
            }
            return false;
        }

    }
}
