package Strings.TokenizerFiles;

import java.util.StringTokenizer;

public class ReverseWordsOfString {
    static void main(String[] args) {
        String str = "Hello World, kaise ho?";
        System.out.println(RevWords(str));
    }

    static String RevWords(String str){
        StringTokenizer st = new StringTokenizer(str);
        int n = st.countTokens();
        String Reverse = "";

        for (int i = 0; i < n; i++) {
            String temp = st.nextToken();
            StringBuffer sb = new StringBuffer(temp);
            sb.reverse();
            String revtemp = sb.toString();
            Reverse = Reverse.concat(revtemp+" ");
        }
        return Reverse;
    }
}
