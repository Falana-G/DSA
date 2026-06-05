package Matrix;

import java.util.Arrays;

public class Sort_Each_Column {
    static void main(String[] args) {
        int arr[][] = {
                {11, 2, 23, 4},
                {522, 63, 73, 8},
                {9, 310,11,122},
                {13,14,125,136}
        };
        print(Sort(arr));
    }

    public static int[][] Sort(int [][]arr){
        int a[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < arr[i].length; j++) {
                a[k] = arr[j][i];
                k++;
            }
            Arrays.sort(a);

            k = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[j][i] = a[k];
                k++;
            }
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
