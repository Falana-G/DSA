package Number_Theory;

public class Largest_Prime_no {
    static void main(String[] args) {
        int n = 5;
        System.out.println(Prime(n));
    }

    public static int Prime(int n){
        int max = 0;
        while(n%2 == 0){
            n /= 2;
            max = 2;
        }
        for (int i = 3; i <= n; i+=2) {
            while(n%i == 0){
                n /= i;
                max = i;
            }
        }
        return max;
    }
}
