package Recursion.TreeRecursion;

public class Ways_to_Score {
    static void main(String[] args) {
        int []arr = {1,3,5};
        int score = 15;
        ways(arr, 0, score, 0, "");
    }

    static void ways(int []arr, int i, int score, int sum, String ans){
        if(sum == score){
            System.out.println(ans.trim());
        }else if(sum > score || i == arr.length){
            return;
        }
        else{
            // Include Same
            ways(arr, i, score, sum+arr[i], ans+arr[i]+" ");

            // Include Next
            ways(arr, i+1, score, sum, ans);
        }
    }
}
