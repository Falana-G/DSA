package Recursion;

public class Count_Digits {
    static void main(String[] args) {
        int n = 1234;
        System.out.println(count(n));
    }

    static int count(int n){
        if(n < 10){
            return 1;
        }
        else{
            n /= 10;
            return 1+count(n);
        }
    }
}
