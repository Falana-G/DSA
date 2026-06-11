package Recursion;

public class Factorial {
    static void main(String[] args) {
        int n = 5;
        int ans = 1;
        int a = HeadFact(n);
        TailFact(n, ans);
        System.out.println(a);
    }

    public static int HeadFact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * HeadFact(n-1);
        }
    }
    public static void TailFact(int n, int ans){
        if(n==0){
            System.out.println(ans);;
        }
        else{
            ans *= n;
            TailFact(n-1, ans);
        }
    }
}
