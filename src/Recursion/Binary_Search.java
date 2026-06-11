package Recursion;

public class Binary_Search {
    static void main(String[] args) {
        int []arr = {1, 4, 8, 9, 13};
        int n = 9;
        System.out.println(search(arr, 0, arr.length-1, n));
    }

    static int search(int []arr, int min, int max, int n){
        if(min > max){
            return -1;
        }
        int i = (min+max)/2;
        if(arr[i] < n){
            return search(arr, i+1, max, n);
        }else if(arr[i] > n){
            return search(arr, min, i-1, n);
        }
        return i;
    }
}
