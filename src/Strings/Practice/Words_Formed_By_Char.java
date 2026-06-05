package Strings.Practice;

import java.util.HashMap;

public class Words_Formed_By_Char {
    static void main(String[] args) {
        String[] srr = {"cat","bt","hat","tree"};
        String chars = "atach";
        System.out.println(Count(srr, chars));
    }

    public static int Count(String[] srr, String chars){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            int val = hm.getOrDefault(chars.charAt(i), 0);
            val++;
            hm.put(chars.charAt(i), val);
        }

        int n = 0;
        for (int i = 0; i < srr.length; i++) {
            if(Check(srr[i], hm)){
                n += srr[i].length();
            }
        }
        return n;
    }

    public static boolean Check(String srr, HashMap<Character, Integer> map){
        HashMap<Character, Integer> hm = new HashMap<>(map);
        for (int j = 0; j < srr.length(); j++) {
            char c = srr.charAt(j);
            if (hm.getOrDefault(c, 0) >= 1){
                int val = hm.getOrDefault(c, 0);
                val--;
                hm.put(c, val);
            }else{
                return false;
            }
        }
        return true;
    }
}