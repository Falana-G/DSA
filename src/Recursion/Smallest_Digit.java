package Recursion;

public class Smallest_Digit {
    static void main(String[] args) {
        int n = 123;
        int s = Integer.MAX_VALUE;
        System.out.println(small(n, s));
    }

    static int small(int n, int s){
        if(n == 0){
            return (s==Integer.MAX_VALUE) ? 0 : s;
        }
        else{
            return n%10<s ? small(n/10, n%10) : small(n/10, s);
        }
    }
}