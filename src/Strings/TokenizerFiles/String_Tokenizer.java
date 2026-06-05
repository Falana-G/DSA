package Strings.TokenizerFiles;

import java.util.*;

//word by word todna string ko
public class String_Tokenizer {
    static void main(String[] args) {

        //s.split
        String s = "Hello World, Kaise ho?";
        String arr[] = s.split(" ");
        System.out.println(Arrays.toString(arr));

        //Actual Tokenizer
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
// Making Shortform
        for (int i = 0; i < n; i++) {
            String temp = st.nextToken();
            System.out.print(temp.charAt(0)+".");
        }
    }
}
