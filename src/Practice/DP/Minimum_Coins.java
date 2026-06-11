package Practice.DP;

/*
A chocolate shop gives special reward coins.
Available coin values:
1
4
5
A customer wants to redeem exactly 8 chocolates.
Find the minimum number of coins required.
A coin may be used multiple times.
Input
Available coin values: 3
1 4 5
Amount: 8
Output
2
Explanation
Use:
4 + 4
Only 2 coins.
Using:
5 + 1 + 1 + 1
requires 4 coins.
*/


import java.util.Arrays;

public class Minimum_Coins {
    static void main(String[] args) {
        int []coins  = {1, 2147483647};
        int amount = 2;
        System.out.println(Minimum(coins, amount));
    }

    public static int Minimum(int[] coins, int amount){
        Arrays.sort(coins);
        int []count = new int[coins.length];
        int remain = Integer.MAX_VALUE;
        if(amount == 0){return 0;}

        for (int i = coins.length-1; i >= 0; i--) {
            if(amount >= coins[i]){
                remain = amount%coins[i];
                count[i] = amount/coins[i];
                for (int j = i-1; j >= 0; j--) {
                    if(remain > 0 && remain >= coins[j]){
                        count[i] += remain/coins[j];
                        remain = remain%coins[j];
                    }
                }
            }
            else{
                count[i] = Integer.MAX_VALUE;
            }
        }
        if(remain != 0){
            return -1;
        }
        int res = Integer.MAX_VALUE;
        for(int x : count){
            res = Math.min(res, x);
        }
        return res;
    }
}
