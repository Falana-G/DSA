package PlayingWithNumbers;

public class NumToBinary {
    static void main() {
        int n = 3;
        System.out.println(Binary(n));
    }
    static String Binary(int n){
        String ans = "";
        int i=0;
        while(n!=0){
            i=n%2;
            ans = i+ans;
            n/=2;
        }
        return ans;
    }
}
