package Arr;

import java.util.Arrays;

public class Merge2Arrays {
    static void main() {
        int arr1[] = {10,7,2,6};
        int arr2[] = {12,5,8};
        System.out.println(Arrays.toString(MergeArray(arr1,arr2)));
    }

    static int[] MergeArray(int arr1[], int arr2[]){
        int arrM[] = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            arrM[i] = arr1[i];
        }
        int j=0;
        for (int i = 0; i < arr2.length; i++) {
            arrM[i+ arr1.length] = arr2[j];
            j++;
        }
        return arrM;
    }
}
