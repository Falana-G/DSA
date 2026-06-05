package Number_Theory;

import java.util.Scanner;

public class Pastery {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt();
            int n =a;
            if (a>2){
                n/=2;
                n+=1;
                System.out.println(n);
            }else{
                System.out.println(a);
            }
        }
    }
}
