package Recursion;

public class Sum_of_Elements_of_Array {
    static void main(String[] args) {
        int []arr = {1,3,2,5};
        int sum = Sum(arr, arr.length-1);
        System.out.println(sum);
    }

    public static int Sum(int []arr, int length){
        if(length >= 0){
            return arr[length] + Sum(arr, length-1);
        }else{
            return 0;
        }
    }
}
