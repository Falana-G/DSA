package Arr;

import java.util.HashSet;

public class Two_Sum {
    static void main() {
        int arr[] = {7,1,2,8,9,10};
        int target_sum = 14;
        int a = Check_sum(arr, target_sum);
        if(a!=-1){
            System.out.println(a+" + "+(target_sum-a));
        }else {
            System.out.println("Not found!");
        }
    }

    static int Check_sum(int arr[], int target_sum){
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hset.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int a = target_sum - arr[i];
            if (hset.contains(a) == true && arr[i]!=a) {
                return arr[i];
            }
        }
        return -1;
    }
}