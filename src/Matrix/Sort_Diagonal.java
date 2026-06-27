package Matrix;

import java.util.Arrays;

public class Sort_Diagonal {
    static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 11, 8},
                {9, 10,1,12},
                {13,14,15,10}
        };
        print(Sort(arr));
    }
    public static int[][] Sort(int arr[][]){
        int a[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i][i];
        }
        Arrays.sort(a);

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = a[i];
        }
        return arr;
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
