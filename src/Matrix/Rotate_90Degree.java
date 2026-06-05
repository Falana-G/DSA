package Matrix;

public class Rotate_90Degree {
    static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        print(Transpose(arr));
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
    public static int[][] Transpose(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int brr[][] = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                brr[j][i] = arr[i][j];
            }
        }
        int [][]trr = Mirror(brr);
        return trr;
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
