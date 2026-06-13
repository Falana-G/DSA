package Recursion.TreeRecursion;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Partition_of_Number {
    static void main(String[] args) {
        int n = 4;
        System.out.println(partition(n));
    }

    static ArrayList<ArrayList<Integer>> partition(int n){
        ArrayList<ArrayList<Integer>> ml = new ArrayList<>();
        call(n, ml, "", 0, 1);
        return ml;
    }
    static void call(int n, ArrayList<ArrayList<Integer>> ml, String ss, int total, int i){
        if(total == n){
            ArrayList<Integer> al= convert(ss);
            ml.add(al);
        }
        else if(i > n || total>n){
            return;
        }
        else{
            // Include Same
            call(n, ml, ss+i+" ", total+i, i);

            // Don't Include
            call(n, ml, ss, total, i+1);
        }
    }
    static ArrayList<Integer> convert(String ss){
        ss.trim();
        ArrayList<Integer> al = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(ss);
        while(st.hasMoreTokens()){
            al.add(Integer.parseInt(st.nextToken()));
        }
        return al;
    }
}
