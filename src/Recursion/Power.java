package Recursion;

public class Power {
    static void main(String[] args) {
        int n = 2;
        int p = 3;
        int ans = 1;
        System.out.println(powTail(n, p));
        powHead(n, p, ans);
    }

    public static int powTail(int n, int p){
        if(p==0){
            return 1;
        }
        return n * powTail(n, p-1);
    }
    public static void powHead(int n, int p, int ans){
        if(p==0){
            System.out.println(ans);
        }
        else{
            ans = ans*n;
            powHead(n, p-1, ans);
        }
    }
}
