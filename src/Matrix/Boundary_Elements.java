package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Boundary_Elements {
    static void main(String[] args) {
        int arr[][] = {
                {11, 2, 23, 4},
                {522, 63, 73, 8},
                {9, 310,11,122},
                {13,14,125,136}
        };
        int brr[] = Boundary(arr);
        System.out.println(Arrays.toString(brr));
    }

    // Parikrama kro
    public static int[] Boundary(int[][]arr){
        ArrayList<Integer> al = new ArrayList<>();

        for (int j = 0; j < arr[0].length; j++) {
            al.add(arr[0][j]);
        }
        for (int i = 1; i < arr.length; i++) {
            al.add(arr[i][arr[i].length-1]);
        }
        for (int j = (arr.length-1)-1; j >= 0; j--) {
            al.add(arr[arr.length-1][j]);
        }
        for (int i = (arr.length-1)-1; i >= 1; i--) {
            al.add(arr[i][0]);
        }

        int[] brr = new int[al.size()];
        int k = 0;
        for (int e: al){
            brr[k] = e;
            k++;
        }
        return brr;
    }


    /*public static int[] Boundary(int[][] arr){
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0 || i==arr.length-1){
                    al.add(arr[i][j]);
                } else if (j==0 || j==arr[i].length-1) {
                    al.add(arr[i][j]);
                }
            }
        }
        int brr[] = new int[al.size()];
        int k=0;
        for (int e: al){
            brr[k] = e;
            k++;
        }
        return brr;
    }*/
}
