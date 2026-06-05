package Arr.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CandiesKid {
    static void main() {
        int arr[] = {2,3,5,1,3};
        int e = 3;
        boolean tf[] = new boolean[arr.length];

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if((arr[i]+e) >= max){
                tf[i] = true;
            }else{
                tf[i] = false;
            }
        }

        System.out.println(Arrays.toString(tf));
    }
}
