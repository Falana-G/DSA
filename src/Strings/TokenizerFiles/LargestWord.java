package Strings.TokenizerFiles;

import java.util.StringTokenizer;

public class LargestWord {
    static void main(String[] args) {
        String str = "Hello World, kaise ho?";
        String large = Find_Largest(str);
        System.out.println(large);
    }

    static String Find_Largest(String str){
        StringTokenizer st = new StringTokenizer(str);
        int n = st.countTokens();
        String large = "";

        for (int i = 0; i < n; i++) {
            String temp = st.nextToken();
            if (temp.length() > large.length()){
                large = temp;
            }
        }

        return large;
    }
}