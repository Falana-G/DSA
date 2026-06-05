package Strings;

import java.util.Arrays;
import java.util.HashMap;

//Shuffled Strings but Same alphabets
public class Anagrams {
    static void main() {
        String s1 = "ABAC";
        String s2 = "BCA";
        System.out.println(Sorted_Anagram(s1,s2));

        String ss1 = "ABC";
        String ss2 = "BCA";
        System.out.println(Hashmap_Anagram(ss1,ss2));
    }
    // Method1: Hashmap and frequency check
    // Method2: Sort and check if equal
    static Boolean Sorted_Anagram(String s1, String s2){
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);
    }

    static Boolean Hashmap_Anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int val = hm1.getOrDefault(ch, 0);
            val++;
            hm1.put(ch, val);
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            int val = hm2.getOrDefault(ch, 0);
            val++;
            hm2.put(ch, val);
        }
        if(hm1.equals(hm2)){return true;}
        return false;
    }
}
