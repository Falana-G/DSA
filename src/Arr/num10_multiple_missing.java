package Arr;

public class num10_multiple_missing {
    static void main() {
        int arr[] = {3,10,7,4,1,9,6,5};

        //Frequency of each num(Living Hashmap)

        //On-Off Array
        int check_arr[] = new int[11];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            check_arr[num] = 1;
        }

        for (int i = 1; i < check_arr.length; i++) {
            if(check_arr[i]==0){
                System.out.println("Missing: "+i);
            }
        }

    }
}
