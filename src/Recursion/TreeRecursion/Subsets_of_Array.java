package Recursion.TreeRecursion;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Subsets_of_Array {
    static void main(String[] args) {
        int []arr = {1,2,3};
        System.out.println(subsets(arr));
    }

    static public ArrayList<ArrayList<Integer>> subsets(int []arr){
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        subset(arr, 0, "", mainlist);
        return mainlist;
    }
    static void subset(int[] arr, int i, String ans, ArrayList<ArrayList<Integer>> mainlist) {
        if (i == arr.length) {
            ans = ans.trim();
            ArrayList<Integer> al = convert(ans);
            mainlist.add(al);
        }
        else{
            // Include
            String temp = ans + arr[i] + " ";
            subset(arr, i + 1, temp, mainlist);

            //Don't Include
            subset(arr, i + 1, ans, mainlist);
        }
    }

    static ArrayList<Integer> convert(String str){
        ArrayList<Integer> al = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(str);
        int n = st.countTokens();
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            al.add(a);
        }
        return al;
    }
}
