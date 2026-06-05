package Strings.Practice;

public class Rev_Str_II {
    static void main(String[] args) {
        String str = "abcdefg";
        int k = 3;
        String rts = Rev(str, k);
        System.out.println(rts);
    }

    public static String Rev(String str, int k){
        StringBuffer sb = new StringBuffer(str);
        String ret = "";

        int i = 0;
        while(i < sb.length()){

            if(sb.substring(i).length() < 2*k && sb.substring(i).length() >= k){
                StringBuffer temp = new StringBuffer(sb.substring(i, i+k));
                temp.reverse();
                ret = ret + temp + sb.substring(i+k);
                break;
            }
            else if (sb.substring(i).length() < k) {
                StringBuffer temp = new StringBuffer(sb.substring(i));
                temp.reverse();
                ret = ret + temp;
                break;
            }
            else{
                StringBuffer temp = new StringBuffer(sb.substring(i, i+k));
                temp.reverse();
                ret = ret + temp + sb.substring(i+k, i+2*k);
                i += 2*k;
            }
        }
        return ret;
    }
}
