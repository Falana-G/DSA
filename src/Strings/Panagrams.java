package Strings;

import java.util.HashSet;

//A-Z saare alphabets haige ne
public class Panagrams {
    static void main() {
        String str = "the quick brown fox jumps over the lazy dog";
        System.out.println(Check_Panagram(str));
    }

    // Set bnao, duplicates uda dega, and if set ka length = 26, true
    static Boolean Check_Panagram(String str){
        String ss = str.toLowerCase();
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(ss.charAt(i))){
                hs.add(ss.charAt(i));
            }
        }
        return (hs.size()==26);
    }
}
