package Strings.Practice;

public class Great_String {
    static void main(String[] args) {
        String str = "LeEtcode";
        System.out.println(Great(str));
    }

    public static String Great(String s){
        StringBuffer str = new StringBuffer(s);
        StringBuffer lstr = new StringBuffer(s.toLowerCase());
        for (int i = 0; i < lstr.length()-1; i++) {
            if (str.toString().charAt(i) == lstr.toString().charAt(i+1)){
                if (lstr.toString().charAt(i) != str.charAt(i+1)){
                    str.delete(i, i+2);
                    String ret = Great(str.toString());
                    return ret;
                }

            }
        }
        return str.toString();
    }
}
