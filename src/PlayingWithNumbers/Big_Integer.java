package PlayingWithNumbers;

import java.math.*;

public class Big_Integer {
    static void main() {
        BigInteger a = new BigInteger("12345689123456891234568912345689");
        BigInteger b = new BigInteger("12345689123456891234568912345689");

        BigInteger c =a.add(b);
        BigInteger d = b.divide(a);
        System.out.println(c+" "+d);

        System.out.println(fact(BigInteger.valueOf(920822375)));
    }
    static BigInteger fact(BigInteger a){
        BigInteger n = new BigInteger("1");

        if(a.compareTo(BigInteger.valueOf(1))!=0 && a.compareTo(BigInteger.valueOf(0))!=0){
            System.out.println("If");
            for (BigInteger i = new BigInteger("1"); i.compareTo(a) <= 0; i=i.add(BigInteger.valueOf(1))) {
                n = n.multiply(i);
            }
            return n;
        }else {return BigInteger.valueOf(1);}
    }
}
