package Arr;

import java.util.HashSet;

public class Contains_Duplicates {
    //Leetcode 217
    static void main() {
        int arr[] = {1,2,3,1};
        System.out.println(ContainDuplicate(arr));
    }

    static boolean ContainDuplicate(int arr[]){
        HashSet<Integer> ss = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            ss.add(arr[i]);
        }

        if (ss.size() == arr.length){
            return false;
        } else{
            return true;
        }
    }
}


// pehle arr di length kdho,
// then Set ch paa do,  (Set duplicates remove kr denda hai)
// fir length kdho,
// je dono lengths ch difference aaya,
// te Duplicates exist