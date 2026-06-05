package Lists.Practice;

public class Reverse_List_O1_Space {
    static void main(String[] args) {
        ListNode n5 = new ListNode(50);
        ListNode n4 = new ListNode(40, n5);
        ListNode n3 = new ListNode(30, n4);
        ListNode n2 = new ListNode(20, n3);
        ListNode n1 = new ListNode(10, n2);
        ListNode h1 = n1;

        print(reverse(h1));
    }

//  1. Stack
//  2. New List (last to first)
//  3. 3-pointer method( O(1)Space i.e bina kisi extra cheez ke)

//  3-Pointer approach
    public static ListNode reverse(ListNode start){
        if (start == null || start.next == null) {
            return start;
        }
        ListNode t1 = null;
        ListNode t2 = start;
        ListNode t3 = start.next;

        while (true){
            t2.next = t1;
            t1 = t2;
            t2 = t3;
            if(t2 == null){break;}
            t3 = t3.next;
        }
        start = t1;
        return start;
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
