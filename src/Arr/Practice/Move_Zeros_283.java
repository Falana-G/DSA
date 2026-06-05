package Arr.Practice;

import java.util.Arrays;

public class Move_Zeros_283 {
    static void main(String[] args) {
        int nums[] = {1,0,3,12,0,13,2,0};
        int arr[] = MoveZeros(nums);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] MoveZeros(int arr[]){

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}


// 1 , 2 , 3 , 4 , 0 , 0 , 5, 6
