package Arr;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteDuplicatesFromSortedArray {
    static void main() {
        int arr[] = {2,3,3,5,8,10,10,10,12,15,15,20,25};
        int arrD[] = DeleteDuplicates(arr);
        System.out.println(Arrays.toString(arrD));
    }

    // Method1: TreeSet... O(NlogN)
    // Method2: Frequency table(TreeMap)... O(NlogN)
    // Method3: ArrayList bnao, al[1] & al[i+1] check kro, agar same toh uda do
    static int[] DeleteDuplicates(int arr[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int e: arr){
            al.add(e);
        }

        for (int i = 0; i < al.size()-1; i++) {
            if (al.get(i) == al.get(i+1)){
                al.remove(i);
                i--;
            }
        }

        int brr[] = new int[al.size()];
        int i=0;
        for(int e: al){
            brr[i] = e;
            i++;
        }
        return brr;
    }
}
