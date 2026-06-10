package Practice.DP;

/*
A research company has developed a robot that needs to travel through a vertical energy tunnel.
The tunnel contains N energy pods arranged one above another.
The robot starts at pod 0 and wants to reach pod N.
Due to its design limitations, the robot can:
Jump to the next pod (+1)
Jump over one pod (+2)
Find the total number of distinct ways the robot can reach pod N.
Since the number of ways can be large, print the answer.

Input
4
Output
5
Explanation:
The possible paths are:
1 1 1 1
1 1 2
1 2 1
2 1 1
2 2
Total ways:
5
*/


public class Climbing_Stairs {
    static void main(String[] args) {
        int n = 4;
        Ways(n);
    }
    public static void Ways(int n){
        int []steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            steps[i] = steps[i-1] + steps[i-2];
        }
        System.out.println(steps[n-1]);
    }
}
