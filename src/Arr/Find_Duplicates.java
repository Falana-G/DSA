package Arr;

import java.util.*;

public class Find_Duplicates {
    //Leetcode 442
    static void main() {
        int arr[] = {4,3,2,7,8,2,3,1,2,4};
        int ar[] = {4,3,2,7,8,2,3,1};

        List<Integer> dup = SetDuplicates(ar);
        System.out.println(dup);

        List<Integer> dupdup = HashmapDuplicates(arr);
        System.out.println(dupdup);
    }

    // Agar Occurence 2 se zyada hai
    static List<Integer> HashmapDuplicates(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            //Shortcut
            int val = map.getOrDefault(num,0);
            val++;
            map.put(num,val);

            /*if(map.get(num)==null){
                map.put(num, 1);
            }
            else{
                int val = map.get(num);
                val++;
                map.put(num,val);
            }*/
        }
        List<Integer> al = new ArrayList<>();

        //Get all Keys
        Set<Integer> keys = map.keySet();

        //Traverse and get values of all Keys
        for (int i: keys) {
            int val = map.get(i);
            if(val>1){
                al.add(i);
            }
        }
        return al;
    }

    //Agar Occuernce 2 se zyada nhi hai
    //Same cheez Hashmap se bhi ho jayegi, uske Long method me else change krke
    static List<Integer> SetDuplicates(int arr[]){
        List<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i: arr){
            if(hs.add(i) == false){
                al.add(i);
            }
        }
        return al;
    }
}