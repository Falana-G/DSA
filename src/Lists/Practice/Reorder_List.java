package Lists.Practice;

import java.util.ArrayDeque;

public class Reorder_List {
    static void main(String[] args) {
        ListNode n5 = new ListNode(50);
        ListNode n4 = new ListNode(40, n5);
        ListNode n3 = new ListNode(30, n4);
        ListNode n2 = new ListNode(20, n3);
        ListNode n1 = new ListNode(10, n2);
        ListNode h1 = n1;

        Reorder(h1);
        print(h1);
    }

    public static void Reorder(ListNode start){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        ListNode t = start;
        while (t != null){
            dq.add(t.val);
            t = t.next;
        }

        t = start;
        int i;
        while (true){
            if (dq.isEmpty()){break;}
            i = dq.removeFirst();
            t.val = i;
            t = t.next;

            if(dq.isEmpty()){break;}
            i = dq.removeLast();
            t.val = i;
            t = t.next;
        }
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
