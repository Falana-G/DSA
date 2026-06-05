package Arr;

import java.util.Arrays;

public class Merge2SortedArrays {
    static void main() {
        int arr1[] = {2,3,8,10,15,20};
        int arr2[] = {1,5,9,16,18,20,22,54};
        System.out.println(Arrays.toString(SortedMerge(arr1,arr2)));
    }

    static int[] SortedMerge(int arr1[], int arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        int arrM[] = new int[m+n];

        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                arrM[k] = arr1[i];
                i++;
                k++;
            }else{
                arrM[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(i==m){
            while(j<n){
                arrM[k] = arr2[j];
                j++;
                k++;
            }
        } else if (j==n) {
            while (i<m){
                arrM[k] = arr1[i];
                i++;
                k++;
            }
        }
        return arrM;
    }
}
