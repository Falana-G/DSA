package Recursion;

public class Check_Sort {
    static void main(String[] args) {
        int []arr = {3,4,0};
        System.out.println(isSorted(arr, arr.length-1));
    }

    static boolean isSorted(int []arr, int i){
        if(i<1){
            return true;
        }
        boolean r = arr[i] > arr[i-1];
        if(!r){
            return false;
        }
        return r && isSorted(arr, i-1);
    }
}
