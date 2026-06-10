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



public class Minimum_Coins {
    static void main(String[] args) {
        int []coins  = {1,4,5};
        int amount = 8;
        System.out.println(Minimum(coins, amount));
    }

    public static int Minimum(int[] coins, int amount){
        int count = 0;
        for (int i = coins.length-1; i >= 0 ; i--) {
            if(coins[i] <= amount){
                int remain = amount%coins[i];
                count = amount/coins[i];
                for (int j = i-1; j >= 0; j--) {
                    if(remain >= coins[j]){
                        count += remain/coins[j];
                        remain = remain%coins[j];
                        if(remain == 0){
                            break;
                        }
                    }
                }
                break;
            }
        }
        return count;
    }
}
