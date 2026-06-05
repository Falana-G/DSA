package Arr.Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Plus_one_66 {
    static void main(String[] args) {
        int arr[] = {1,2,9};
        System.out.println(Arrays.toString(plus(arr)));
    }

    static int[] plus(int arr[]){
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            else{
                arr[i] = 0;
            }
        }

        int arr2[] = new int[arr.length+1];
        arr2[0] = 1;
        return arr2;



        /*int num = 0;

        int p = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            int temp = (int) Math.pow(10, p);
            num += (arr[i]*temp);
            p++;
        }

        num+=1;
        int temp = num;

        ArrayList<Integer> al = new ArrayList<>();
        while(temp != 0){
            int a = temp%10;
            al.addFirst(a);
            temp/=10;
        }

        int arrP[] = new int[al.size()];
        int i=0;
        for (int e: al){
            arrP[i] = e;
            i++;
        }

        return arrP;*/
    }
}
