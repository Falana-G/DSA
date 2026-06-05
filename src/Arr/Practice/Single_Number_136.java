package Arr.Practice;

import java.util.*;

public class Single_Number_136 {
    static void main(String[] args) {
        int arr[] = {1,4,2,5,2,1,5};
        System.out.println(SingleNum(arr));
    }

    static int SingleNum(int arr[]){
        HashSet<Integer> hs = new HashSet();

        for(int i: arr){
            if(hs.contains(i)){
                hs.remove(i);
            }
            else{
                hs.add(i);
            }
        }

        int num = 0;
        for (int x: hs){
            num = x;
        }
        return num;
    }
}
