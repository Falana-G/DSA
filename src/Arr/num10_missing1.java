package Arr;

public class num10_missing1 {
    static void main() {
        int arr[] = {3,10,7,4,1,2,9,6,5};
            //Frequency of each number
            //Linear Search of each number

        //Expected = 1+2+3+4+5+6+7+8+9+10 = n(n+1)/2 = 55
        //Actual = 47
        //Diff. = 55-47 = 8 ..... 8 is missing number

        int n = (arr.length+1);
        int expected = n*(n+1)/2;
        int sum = java.util.Arrays.stream(arr).sum();
        int dif = expected-sum;
        System.out.println(dif);
    }
}
