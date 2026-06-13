package Recursion.TreeRecursion;

public class Subsets_of_String {
    static void main(String[] args) {
        String str = "ABC";
        String ans = "";
        int []count = {0, 0};
        subset(str, 0, ans, count);
        System.out.println("\nNo. of Base condition nodes: " + count[0]);
        System.out.println("No. of nodes: " + count[1]);
    }
    static void subset(String str, int i, String ans, int[] count){

        count[1]++;
        if(i == str.length()){
            System.out.print(ans + ", ");
            count[0]++;
        }
        else{
            // Include
            char ch = str. charAt(i);
            subset(str, i+1, ans+ch, count);

            // Don't Include
            subset(str, i+1, ans, count);
        }
    }

}
