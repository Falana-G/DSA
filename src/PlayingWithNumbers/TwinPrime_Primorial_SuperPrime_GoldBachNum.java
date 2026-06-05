package PlayingWithNumbers;

public class TwinPrime_Primorial_SuperPrime_GoldBachNum {
    static void main() {
        int l =1;
        int u =88;
        int p = 13;
        int s = 11;
        int n = 30;
        twin(l,u);
        System.out.println(primorial(p));
        System.out.println(SuperPrime(s));
        GoldBachNum(n);
    }

    //An Even no. can be defined as Sum of 2 Prime numbers
    static void GoldBachNum(int n){

    }

    // Prime and a sum of consecutive primes
    static boolean SuperPrime(int s){
        if(IsPrime(s)){
            int i=0;
            int sum=0;
            while (true){
                sum +=i;
                i=NextPrime(i);
                if (sum==s){
                    return true;
                } else if (sum>s) {
                    return false;
                }
            }
        }
        return false;
    }

    // 13# = 13*11*7*5*3*2
    static int primorial(int p){
        int n=1;
        for (int i = 2; i <=p ; i++) {
            if(IsPrime(i)){
               n *= i;
            }
        }
        return n;
    }

    static void twin(int l, int u){
        for (int i = l; i <= u; i++) {
            if(IsPrime(i) && IsPrime(i+2)){
                System.out.println(i+", "+(i+2));
            }
        }
    }


    static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }else{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){return false;}
            }
        }
        return true;
    }
    static int NextPrime(int n){
        int i = n;
        while(true){
            i++;
            if(IsPrime(i)){
                return i;
            }
        }
    }
}
