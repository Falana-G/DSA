package Arr;

import java.util.Arrays;

public class ReverseOfArray {
    static void main() {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int l = arr.length;

        for (int i = 0; i <= l/2; i++) {
            int x = arr[(l-1)-i];
            arr[(l-1)-i] = arr[i];
            arr[i] = x;
        }

        System.out.println(Arrays.toString(arr));
    }
    //Stack naal
    //brr[i] = arr[(arr.length-1)-i]
}
