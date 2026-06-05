package PlayingWithNumbers;

public class SeparationAndReverseDigits {
    static void main() {
        int n = 1234;
        Separation(n);
        int R = Reverse(n);
        System.out.println(R);
    }

    static void Separation(int n){
        int i=0;
        while(n!=0){
            i=n%10;
            System.out.println(i);
            n/=10;
        }
    }
    static int Reverse(int n){
        int rev=0;
        while(n!=0){
            int i=n%10;
            rev=rev*10+i;
            n/=10;
        }
        return rev;
    }
}
