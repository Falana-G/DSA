package Recursion.TreeRecursion;

public class Combinations {
    static void main(String[] args) {
        int n = 4;
        int r = 2;
        System.out.println(comb(n,r));
    }

    static int comb(int n, int r){
        if(r==0 || n==r){
            return 1;
        }
        else{
            return comb(n-1, r-1)+ comb(n-1, r);
        }
    }
}
