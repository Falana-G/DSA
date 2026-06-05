package Strings.Practice;

public class Add_Digits {
    static void main(String[] args) {
        int n = 38;
        int res = Add(n);
        System.out.println(res);
    }

    public static int Add(int n){
        while (n >= 10){
            int sum = 0;
            while(n > 0){
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
}
