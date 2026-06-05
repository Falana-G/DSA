package Arr;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class UnionOf2Arrays {
    static void main() {
        int arr1[] = {3,6,10,2,5};
        int arr2[] = {7,6,10,3,4};
        int arrU[] = Union(arr1, arr2);
        System.out.println(Arrays.toString(arrU));
    }

    static int[] Union(int arr1[], int arr2[]){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int i: arr1){
            lhs.add(i);
        }
        for(int i: arr2){
            lhs.add(i);
        }

        int n = lhs.size();
        int arr[] = new int[n];
        int i = 0;
        for(int e: lhs){
            arr[i] = e;
            i++;
        }

        return arr;
    }
}
