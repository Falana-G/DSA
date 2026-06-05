package Strings.Practice;

public class Reverse_Bits {
    static void main(String[] args) {
        int num = 12345;
        int bin = Rev(num);
        System.out.println(bin);
    }

    public static int Rev(int num){
        if(num == 0){return 0;}

        String bin = "";
        for (int i = 0; i < 32; i++) {
            int rem = num & 1;
            bin = rem + bin;
            num >>>= 1;
        }
        StringBuffer sb = new StringBuffer(bin);
        sb.reverse();
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}

