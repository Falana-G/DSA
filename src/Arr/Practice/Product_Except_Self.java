package Arr.Practice;

import java.util.Arrays;

public class Product_Except_Self {
    static void main() {
        int arr[] = {2,4,3,6};
        int ans[] = new int[arr.length];

        ans[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i-1]*arr[i-1];
        }

        int right = 1;
        for (int i = arr.length-1; i >= 0; i--) {
            ans[i] = right*ans[i];
            right = right*arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
