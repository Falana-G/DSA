package Strings;

import java.util.Arrays;

public class AscendingOrder {
    static void main(String[] args) {
        String str = "Banana Apple Pineapple aaa";
        String Asc = ConvertAscending(str);
        System.out.println(Asc);
    }
    static String ConvertAscending(String str){
        String arr[] = str.split(" ");
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }
}
