package Recursion.TreeRecursion;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Ways_to_Target_Sum {
    static void main(String[] args) {
        int []nums = {1, 2, 3, 7, 8, 10};
        int target = 10;
        int n = 0;
        String ss = "";
        List<Integer> al = new ArrayList<>();
        ways(nums, 0, target, n, ss);
    }

    static void ways(int []nums, int i, int target, int n, String ss){
        if(i == nums.length){
            if(n == target){
                ss = ss.trim();
                System.out.println(convert(ss));
            }
        }
        else{
            // Include
            ways(nums, i+1, target, n+nums[i], ss+nums[i]+" ");
            // Don't Include
            ways(nums, i+1, target, n, ss);
        }
    }

    static ArrayList<Integer> convert(String ss){
        StringTokenizer st = new StringTokenizer(ss);
        ArrayList<Integer> al = new ArrayList<>();
        while(st.hasMoreTokens()){
            al.add(Integer.parseInt(st.nextToken()));
        }
        return al;
    }
}
