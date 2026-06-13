package Miscelleneous;

import java.util.ArrayList;
import java.util.Arrays;

// Josephus Problem
public class Circle_of_Death {
    static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int k = 3;
        int i = 0;
        while (al.size()>1){
            i = (i+k-1)%al.size();
            al.remove(i);
        }
        System.out.println("Survivor: " + al);
    }
}
