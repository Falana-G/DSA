package PlayingWithNumbers;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    static void main() {
        int a = 153;
        Armstrong(a);
    }
// If ek number ke har ek digit ko uske number of digits ki power krke plus kiya jaye,
// and result same number aaye, toh voh Armstrong number hai
    static void Armstrong(int a){
        List<Integer> al = new ArrayList<>();
        int arm = 0;
        int i=0;
        int n = a;
        while(n!=0){
            i=n%10;
            n/=10;
            al.add(i);
        }
        int length = al.size();
        for(int e: al){
            arm += Math.pow(e,length);
        }
        if (arm == a){
            System.out.println("Armstrong!");
        }else {
            System.out.println("Kuch nhi");
        }
    }
}
