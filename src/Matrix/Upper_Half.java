package Matrix;

public class Upper_Half {
    static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Upper(arr);
    }

    public static void Upper(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= i){
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }
    }
}
