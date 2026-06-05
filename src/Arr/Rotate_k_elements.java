package Arr;

import java.util.Arrays;

public class Rotate_k_elements {
    static void main() {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int k = 3;
        int arrRotate[] = Rotate(arr, k);
        System.out.println(Arrays.toString(arrRotate));
    }
    //Method1: k times sabhi elements ko aage shift krte jao... O(k*N)

    //Method2: last k elements ka array bnao, and baaki array ko direct k spaces shift krdo, then k array ko arr ke aage lga do
    // Space complexity bdha ke Time complexity km krdi
    static int[] Rotate(int arr[], int k){
        int n = arr.length;

        k = k % n;

        int arrK[] = new int[k];
        for (int i = 0; i < k; i++) {
            arrK[i] = arr[i+(n-k)];
        }
        for (int i = (n-1)-k; i >= 0; i--) {
            arr[i+k] = arr[i];
        }
        for (int i = 0; i < arrK.length; i++) {
            arr[i] = arrK[i];
        }
        return arr;
    }
}
