package Matrix;

public class Add_Both_Diagonals {
    static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Add(arr));
    }

    public static int Add(int arr[][]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j){
                    sum += arr[i][j];
                }
                if (i+j == arr.length-1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
