package Dynamic_Programming;

import java.util.Arrays;

public class Fibonacci_Series {
    static void main(String[] args) {
        int n = 5;
        int []dp = new int[n+1];
        Arrays.fill(dp, 0);
        System.out.println(fibo(n, dp));
    }

    static int fibo(int n, int []dp){
        if (n <= 1) {
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int ans = fibo(n-1, dp) + fibo(n-2, dp);
        dp[n] = ans;
        return ans;
    }
}
