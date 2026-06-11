package Dynamic_Programming;

public class Min_Cost_Climb_Stairs {
    static void main(String[] args) {
        int [] cost = {10, 15, 20};
        System.out.println(Stairs(cost));
    }
    static int Stairs(int[] cost){
        return Math.min(minCost(0, cost), minCost(1,cost));
    }
    public static int minCost(int i, int[] cost) {
        if(i>=cost.length){
            return 0;
        }
        return Math.min(minCost(i+1, cost), minCost(i+2, cost));
    }
}
