package Strings.Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class First_Unique {
    static void main(String[] args) {
        String s = "lovEleetcode";
        System.out.println(Unique(s));
    }

    public static int Unique(String s){
        String str = s.toLowerCase();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int val = hm.getOrDefault(str.charAt(i), 0);
            val++;
            hm.put(str.charAt(i), val);
        }

        Set<Character> sc = hm.keySet();
        for (int i = 0; i < str.length(); i++) {
            int value = hm.get(str.charAt(i));
            if(value == 1){
                return i;
            }
        }
        return -1;
    }
}
