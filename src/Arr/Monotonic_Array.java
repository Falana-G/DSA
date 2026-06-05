package Arr;

public class Monotonic_Array {
    //Leetcode 896
    static void main() {
        int arr[] = {2,3,5,5,7,18,10};
        System.out.println(IsMonotonic(arr));
    }

    static boolean IsMonotonic(int arr[]){
        if(IsAscendeing(arr) || IsDecending(arr)){
            return true;
        }else {
            return false;
        }
    }

    static boolean IsDecending(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                return false;
            }
        }
        return true;
    }

    static boolean IsAscendeing(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}