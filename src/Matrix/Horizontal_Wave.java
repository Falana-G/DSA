package Matrix;

import java.util.Arrays;

public class Horizontal_Wave {
    static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10,11,12},
                {13,14,15,16}
        };
        int hrr[] = Hori(arr);
        System.out.println(Arrays.toString(hrr));
    }

    public static int[] Hori(int[][] arr){
        int n = arr.length * arr[0].length;
        int hrr[] = new int[n];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i%2 == 0){
                    hrr[k] = arr[i][j];
                }
                else{
                    hrr[k] = arr[i][(arr.length-1)-j];
                }
                k++;
            }
        }
        return hrr;
    }
}
