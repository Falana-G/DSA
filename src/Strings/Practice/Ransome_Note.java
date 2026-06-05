package Strings.Practice;

import java.util.HashMap;
import java.util.Set;

public class Ransome_Note {
    static void main(String[] args) {
        String r = "aab";
        String m = "bbhbgafa";
        System.out.println(Check(r, m));
    }

    public static boolean Check(String r, String m){

        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < m.length(); i++) {
            int val = hm.getOrDefault(m.charAt(i), 0);
            val++;
            hm.put(m.charAt(i), val);
        }

        for (int i = 0; i < r.length(); i++){
            char ival = r.charAt(i);
            int val = hm.getOrDefault(ival, 0);
            if (val >= 1){
                val--;
                hm.put(ival, val);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
