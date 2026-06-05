package Number_Theory;

public class LCM_and_GCD {
    static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
    }

    public static int GCD(int a, int b){
        int m = a%b;
        if(m == 0){
            return b;
        }
        else{
            int ret = GCD(b, m);
            return ret;
        }
    }

//    LCM x HCF = A x B
    public static int LCM(int a, int b){
        int l = a*b/GCD(a,b);
        return l;
    }
}
