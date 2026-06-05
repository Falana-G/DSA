package Strings.TokenizerFiles;

import java.util.StringTokenizer;

public class NameInitials {
    static void main(String[] args) {
        String name = "Harkeerat Singh Chawla";
        String Initials = "";
        StringTokenizer st = new StringTokenizer(name);
        int n = st.countTokens();
        for (int i = 0; i < n; i++) {
            String temp = st.nextToken();
            if(i==n-1){
                Initials = Initials.concat(temp);
            }else {Initials = Initials.concat(temp.charAt(0)+".");}
        }
        System.out.println(Initials);
    }
}
