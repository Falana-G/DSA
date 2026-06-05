package Number_Theory;

import java.util.ArrayList;

public class Set_of_Equal_Sums {
    // continuous n numbers in a sequence, divide them in 2sets in a way that both sets are equal
    static void main(String[] args) {
        int n = 19;
        Sets(n);
    }

    public static void Sets(int n){
        int sum = n*(n+1)/2;

        // Agar Odd hai sum toh can't divide into 2 equal parts
        if(sum%2 != 0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
            ArrayList<Integer> al1 = new ArrayList<>();
            ArrayList<Integer> al2 = new ArrayList<>();
            sum/=2;
            for(int i = n; i > 0; i--) {
                if(sum >= i){
                    al1.add(i);
                    sum -= i;
                }
                else {
                    al2.add(i);
                }
            }

            System.out.println(al1.size());
            for (int e: al1){
                System.out.print(e + " ");
            }
            System.out.println("\n" + al2.size());
            for (int e: al2){
                System.out.print(e + " ");
            }
        }
    }
}
