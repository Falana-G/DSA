package Strings.Practice;

public class Detect_Capital {
    static void main(String[] args) {
        String str = "INDIA";
        System.out.println(Capital(str));
    }

    public static boolean Capital(String str){
        String up = str.toUpperCase();
        String low = str.toLowerCase();
        String cap = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();

        if(str.equals(up) || str.equals(low) || str.equals(cap)){
            return true;
        }
        return false;
    }
}
