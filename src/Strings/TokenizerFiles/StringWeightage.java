package Strings.TokenizerFiles;

import java.util.StringTokenizer;

public class StringWeightage {
    static void main(String[] args) {
        String str = "Hello world, kaise ho?";
        Weightage(str);
    }

    static void Weightage(String str){
        StringTokenizer st = new StringTokenizer(str);
        int weight = 0;

        while(st.hasMoreTokens()){
            String word = st.nextToken();
            for (int i = 0; i < word.length(); i++) {
                weight +=word.charAt(i);
            }
            System.out.println(word + " --> " + weight);
        }
    }
}
