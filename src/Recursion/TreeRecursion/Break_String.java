package Recursion.TreeRecursion;

import java.util.Arrays;

public class Break_String {
    static void main(String[] args) {
        String str = "ABCD";
        String arr[] = new String[str.length()+1];
        breaker(str, 0, arr);
    }

    static void breaker(String str, int n, String []arr){
        if(n == str.length()){
            System.out.println(Arrays.toString(arr));
        }
        else{

        }
    }
}
