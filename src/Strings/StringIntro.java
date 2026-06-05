package Strings;

import java.util.Arrays;

public class StringIntro {
    static void main() {

        //String
        String ss = "Hello Me";
        System.out.println(ss.length());
        System.out.println(ss.charAt(3));
        System.out.println(ss.indexOf("l"));
        System.out.println(ss.startsWith("He"));
        System.out.println(ss.endsWith("e"));
        System.out.println(ss.contains("lo M"));
        System.out.println(ss.lastIndexOf("l"));
        System.out.println(ss.compareTo("Hello"));
        System.out.println(ss.equals("Hello"));
        System.out.println(ss.equalsIgnoreCase("hELLO ME"));
        System.out.println(ss.concat("Me Me"));
        System.out.println(ss.toLowerCase());
        System.out.println(ss.toUpperCase());
        System.out.println(ss.replace("Me", "World"));
        char a[] = ss.toCharArray();
        System.out.println(Arrays.toString(a));

        //StringBuffer
        //Stringbuffer me String wale methods toh chlte hi hain, plus neeche wale bhi chlte hain
        StringBuffer sb = new StringBuffer("Kaise ho?");
        System.out.println(sb.append("ho ho"));
        sb.setCharAt(0, 'A');
        System.out.println(sb.reverse());
        System.out.println(sb.delete(1,4));
        System.out.println("Insert:  "+sb.insert(7,"ohhhh"));
        //Buffer da equal() function sahi nhi chda, Try to AVOID it

        //Conversion
        String s = "hii";
        StringBuffer sc = new StringBuffer(s);

        StringBuffer str = new StringBuffer("Hmmm");
        String st = str.toString();
        System.out.println(sc+" "+st);
    }
}
