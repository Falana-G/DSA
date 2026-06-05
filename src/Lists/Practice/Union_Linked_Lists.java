package Lists.Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Union_Linked_Lists {
    static void main(String[] args) {
        ListNode n4 = new ListNode(40);
        ListNode n3 = new ListNode(30, n4);
        ListNode n2 = new ListNode(20, n3);
        ListNode n1 = new ListNode(10, n2);
        ListNode h1 = n1;

        ListNode m4 = new ListNode(40);
        ListNode m3 = new ListNode(34, m4);
        ListNode m2 = new ListNode(20, m3);
        ListNode m1 = new ListNode(15, m2);
        ListNode h2 = m1;

        print(union(h1, h2));
    }

public static ListNode union(ListNode h1, ListNode h2){
    LinkedHashSet<Integer> ss = new LinkedHashSet<>();

    ListNode i = h1;
    while(i!=null){
        ss.add(i.val);
        i = i.next;
    }

    i = h2;
    while (i!=null){
        ss.add(i.val);
        i = i.next;
    }

    ListNode h3 = null;
    ListNode t = h3;
    for (int e: ss){
        ListNode nd = new ListNode(e);
        if(h3 == null){
            h3 = nd;
            t = nd;
        }
        else{
            t.next = nd;
            t = t.next;
        }
    }
    return h3;
}

    public static void print(ListNode head){
        ListNode i = head;
        System.out.print("Start");
        while (i != null){
            System.out.print("-->" + i.val);
            i = i.next;
        }
    }

}
