package Number_Theory;

public class Max_SubArray_Sum {
    static void main(String[] args) {
        int[] arr = {-1, 5, -4, 8, 3, -2, 3};
        System.out.println(Sum(arr));
    }

    static int Sum(int[] arr){
        int prefix = arr[0];
        int ans = prefix;
        for(int i=1; i<arr.length; i++){
            prefix = Math.max(prefix + arr[i], arr[i]);
            ans = Math.max(ans, prefix);
        }
        return ans;
    }
}
