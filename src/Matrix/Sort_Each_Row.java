package Matrix;

import java.util.Arrays;

public class Sort_Each_Row {
    static void main(String[] args) {
        int arr[][] = {
                {11, 2, 23, 4},
                {522, 63, 73, 8},
                {9, 310,11,122},
                {13,14,125,136}
        };
        print(Sort(arr));
    }

    public static int[][] Sort(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
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
