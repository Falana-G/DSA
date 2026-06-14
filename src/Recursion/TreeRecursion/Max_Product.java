package Recursion.TreeRecursion;

import java.util.ArrayList;

public class Max_Product {
    static void main(String[] args) {
        int n = 8;
        System.out.println(product(n));
    }

    static int product(int n){
        int []max = {Integer.MIN_VALUE};
        call(n, 0, 1, 1, max);
        return max[0];
    }

    static void call(int n, int sum, int i, int product, int []max){
        if(sum == n){
            if(product > max[0]){
                max[0] = product;
            }
        }
        else if(sum > n || i > n){

        }
        else{
            // Include
            int a = product * i;
            call(n, sum+i, i, a, max);

            // Don't Include
            call(n, sum, i+1, product, max);
        }
    }
}
