package Number_Theory;

public class Sum_of_Nums_in_String {
    static void main(String[] args) {
        String str = "Hello12Kaise3ho102badhiya6";
        int res = Sum(str);
        System.out.println(res);
    }

    public static int Sum(String str){
        String num = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
            }
            else{
                if(num != ""){
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if(num != ""){
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
