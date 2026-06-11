package Recursion;

public class Linear_Search {
    static void main(String[] args) {
        int []arr = {1,7,3,2,4};
        int n = 1;
        System.out.println(search(arr, arr.length-1, n));
    }

    static int search(int []arr, int i, int n){
        if(i<0){return -1;}
        if(arr[i] == n){
            return i;
        }
        return search(arr, i-1, n);
    }
}
