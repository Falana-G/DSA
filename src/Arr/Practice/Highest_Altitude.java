package Arr.Practice;

public class Highest_Altitude {
    static void main() {
        int arr[] = {-5,1,5,0,-7};
        System.out.println(Altitude(arr));
    }
    public static int Altitude(int arr[]){

        int alt = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            alt+=arr[i];
            if(alt>max){
                max = alt;
            }
        }
        return max;
    }
}
