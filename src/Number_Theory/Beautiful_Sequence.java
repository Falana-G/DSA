package Number_Theory;

public class Beautiful_Sequence {
    // continuous n numbers in a sequence where dif b/w consecutive no. != 1

    static void main(String[] args) {
        int n = 10;
        Beautiful(n);
    }

    public static void Beautiful(int n){
        if(n<=3){
            System.out.println("No Output");
        }
        else{
            for (int i = 2; i <= n ; i+=2) {
                System.out.print(i + " ");
            }
            for (int i = 1; i <= n; i+=2) {
                System.out.print(i + " ");
            }
        }
    }
}
