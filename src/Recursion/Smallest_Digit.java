package Recursion;

public class Smallest_Digit {
    static void main(String[] args) {
        int n = 0;
        int s = Integer.MAX_VALUE;
        System.out.println(small(n, s));
        System.out.println(Headsmall(n));
    }

    static int small(int n, int s){
        if(n == 0){
            return (s==Integer.MAX_VALUE) ? 0 : s;
        }
        else{
            return n%10<s ? small(n/10, n%10) : small(n/10, s);
        }
    }
    static int Headsmall(int n){
        if(n<10){
            return n;
        }
        int r = n%10;
        n /= 10;
        return Math.min(r, Headsmall(n));
    }
}