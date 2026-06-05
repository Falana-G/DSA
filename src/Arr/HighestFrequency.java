package Arr;

import java.util.HashMap;
import java.util.Set;
//Assumed ki koi ek hi element Highest frequency wala hoga

public class HighestFrequency {
    static void main() {
        int arr[] = {10,7,8,20,10,30,7,20,12,20,30,20,40};
        System.out.println(HighestFrequencyNumber(arr));
    }

    static int HighestFrequencyNumber(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        //Pehle Frequency Map ready kiya
        for (int i: arr){
            int val = map.getOrDefault(i,0);
            val++;
            map.put(i,val);
        }

        //Get Key with Max Value
        Set<Integer> keys = map.keySet();
        int large_val = 0;
        int large_num = 0;

        for(int e: keys){
            int val = map.get(e);
            if (val>large_val){
                large_val = val;
                large_num = e;
            }
        }
        return large_num;
    }
}