package Strings;

import java.util.Stack;

public class Backspace_String {
    static void main(String[] args) {
        String st1 = "abs#cE#";
        String st2 = "a#abc";
        System.out.println(Backspace(st1, st2));
        System.out.println(StackBack(st1, st2));
    }

    public static boolean StackBack(String st1, String st2){
        return Stacking(st1).equals(Stacking(st2));
    }
    public static String Stacking(String str){
        Stack<Character> ss = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) != '#'){
                ss.push(str.charAt(i));
            }
            else{
                ss.pop();
            }
        }
        return String.valueOf(ss);
    }


    public static boolean Backspace(String st1, String st2){
        StringBuffer sb1 = new StringBuffer(st1);
        StringBuffer sb2 = new StringBuffer(st2);

        for (int i = 0; i < sb1.length(); i++) {
            if(sb1.charAt(i) == '#'){
                if(i>0){
                    sb1.delete(i-1, i+1);
                    i-=2;
                }
                else{
                    sb1.delete(i,i+1);
                    i--;
                }
            }
        }
        for (int i = 0; i < sb2.length(); i++) {
            if(sb2.charAt(i) == '#'){
                if(i>0){
                    sb2.delete(i-1, i+1);
                    i-=2;
                }
                else{
                    sb2.delete(i,i+1);
                    i--;
                }
            }
        }

        if (sb2.toString().equals(sb1.toString())) {
            return true;
        }else {
            return false;
        }
    }
}
