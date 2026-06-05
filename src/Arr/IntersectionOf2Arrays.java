package Arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class IntersectionOf2Arrays {
    static void main() {
        int arr1[] = {3,6,10,2,5};
        int arr2[] = {7,6,10,3,4};
        int arrI[] = Intersection(arr1, arr2);
        System.out.println(Arrays.toString(arrI));
    }

    static int[] Intersection(int arr1[], int arr2[]){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        List<Integer> ll = new ArrayList<>();
        for(int e: arr1){
            lhs.add(e);
        }
        for(int e: arr2){
            if(lhs.add(e) == false){
                ll.add(e);
            }
        }

        int arr[] = new int[ll.size()];
        int i=0;
        for(int e: ll){
            arr[i] = e;
            i++;
        }
        return arr;
    }
}
