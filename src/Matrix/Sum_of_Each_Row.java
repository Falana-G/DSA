package Matrix;

public class Sum_of_Each_Row {
    static void main(String[] args) {
        int arr[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        Add(arr);
    }

    public static void Add(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of " + i+1 + "th row is: " + sum);
        }
    }
}
