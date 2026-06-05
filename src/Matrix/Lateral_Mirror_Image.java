package Matrix;

public class Lateral_Mirror_Image {
    static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
        };
        int brr[][] = Mirror(arr);
        print(brr);
    }

    public static int[][] Mirror(int [][]arr){
        int mrr[][] = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                mrr[i][(arr[i].length-1)-j] = arr[i][j];
            }
        }
        return mrr;
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
