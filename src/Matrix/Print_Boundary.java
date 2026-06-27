package Matrix;

public class Print_Boundary {
    static void main(String[] args) {
        int arr[][] = {
                {11, 2, 23, 4},
                {522, 63, 73, 8},
                {9, 310,11,122},
                {13,14,125,136}
        };
        print(Boundary(arr));
    }

    public static int[][] Boundary(int[][] arr){
        int[][] brr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0 || i==arr.length-1){
                    brr[i][j] = arr[i][j];
                } else if (j==0 || j==arr[i].length-1) {
                    brr[i][j] = arr[i][j];
                }
                else{
                    brr[i][j] = 0;
                }
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
