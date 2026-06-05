package Strings.Practice;

public class First_Occurrence {
    static void main(String[] args) {
        String h = "leetcode";
        String n = "et";
        System.out.println(Find(n, h));
    }

    public static int Find(String needle, String hay){
        String n = needle.toLowerCase();
        String h = hay.toLowerCase();

        if (h.contains(n)){
            int i = 0;
            int len = n.length();
            while (i < h.length()){
                if(n.equals(h.substring(i, i+len))){
                    return i;
                }
                i ++;
            }
        }
        return -1;
    }
}
