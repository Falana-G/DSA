package Matrix;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Transpose_Matrix_867 {
    static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
        };
        print(Transpose(arr));
    }

    public static int[][] Transpose(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int brr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                brr[j][i] = arr[i][j];
            }
        }
        return brr;
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
