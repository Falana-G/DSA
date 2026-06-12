package Recursion.TreeRecursion;

import java.util.Arrays;

public class Fibonacci {
    static void main(String[] args) {
        int n = 5;
        int []dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(Fib(n));
        System.out.println(FibDP(n, dp));
        System.out.println(FibLoop(n));
    }

    static int Fib(int n){
        if(n<=1){
            return n;
        }
        else{
            return Fib(n-1) + Fib(n-2);
        }
    }

    static int FibDP(int n, int []dp){
        if(n<=1){
            return n;
        }
        else if(dp[n] != -1){
            return dp[n];
        }
        int ans = FibDP(n-1, dp) + FibDP(n-2, dp);
        dp[n] = ans;
        return ans;
    }

    static int FibLoop(int n){
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n+1; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
