package Recursion.TreeRecursion;

public class Subsets_of_String {
    static void main(String[] args) {
        String str = "ABC";
        String ans = "";
        subset(str, 0, ans);
    }
    static void subset(String str, int i, String ans){
        if(i == str.length()){
            System.out.print(ans + ", ");
        }
        else{
            char ch = str. charAt(i);

            // Include
            subset(str, i+1, ans+ch);

            // Don't Include
            subset(str, i+1, ans);
        }
    }

}
