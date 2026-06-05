package Arr.Practice;

public class Place_Flowers {
    static void main() {
        int arr[] = {1,0,0,0,0,1,0,1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(arr, n));
    }

        public static boolean canPlaceFlowers(int[] arr, int n) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0 && (i == 0 || arr[i-1] == 0) && (i == arr.length-1 || arr[i+1] ==0)){
                    count+=1;
                    i++;
                }
            }
            if(count >= n){
                return true;
            }
            return false;
        }
    }

