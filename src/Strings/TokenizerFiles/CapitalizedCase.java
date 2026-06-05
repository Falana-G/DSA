package Strings.TokenizerFiles;

import java.util.StringTokenizer;

public class CapitalizedCase {
    static void main(String[] args) {
        String str = "Hello world, kaise ho?";
        String Cap = Capitalized(str);
        System.out.println(Cap);
    }

    static String Capitalized(String str){
        StringTokenizer st = new StringTokenizer(str);
        String cap = "";

        while (st.hasMoreTokens()){
            String temp = st.nextToken();
            String word = temp.substring(0,1).toUpperCase()+temp.substring(1).toLowerCase();
            cap = cap + word+" ";
        }
        return cap;
    }
}
