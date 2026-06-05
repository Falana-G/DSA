package Lists.Practice;

// LeetCode 21
public class Merge_Sorted_LinkedLists {
    static void main(String[] args) {

        ListNode n4 = new ListNode(40);
        ListNode n3 = new ListNode(30, n4);
        ListNode n2 = new ListNode(20, n3);
        ListNode n1 = new ListNode(10, n2);
        ListNode h1 = n1;

        ListNode m4 = new ListNode(44);
        ListNode m3 = new ListNode(34, m4);
        ListNode m2 = new ListNode(25, m3);
        ListNode m1 = new ListNode(15, m2);
        ListNode h2 = m1;

        print(MergeSorted(h1, h2));
    }

    public static ListNode MergeSorted(ListNode s1, ListNode s2){
        if (s1 == null && s2 == null) {return null;}
        else if (s1 != null && s2 == null) {return s1;}
        else if (s1 == null && s2 != null) {return s2;}
        else{
            ListNode s3 = null;
            ListNode t1 = s1;
            ListNode t2 = s2;
            ListNode t3 = s3;

            int z=0;

            while (true){
                if (t1.val < t2.val){
                    ListNode nd = new ListNode(t1.val);

                    if (s3 == null){
                        s3 = nd;
                        t3 = nd;
                    }
                    else {
                        t3.next = nd;
                        t3 = nd;
                    }
                    t1 = t1.next;
                    if (t1 == null){
                        z=1;
                        break;
                    }
                }
                else{
                    ListNode nd = new ListNode(t2.val);

                    if (s3 == null){
                        s3 = nd;
                        t3 = nd;
                    }
                    else {
                        t3.next = nd;
                        t3 = nd;
                    }
                    t2 = t2.next;
                    if (t2 == null) {
                        z=2;
                        break;
                    }
                }
            }

            if (z == 1){
                while(t2 != null){
                    ListNode nd = new ListNode(t2.val);
                    t3.next = nd;
                    t3 = nd;
                    t2 = t2.next;
                }
            }
            else{
                while(t1 != null){
                    ListNode nd = new ListNode(t1.val);
                    t3.next = nd;
                    t3 = nd;
                    t1 = t1.next;
                }
            }
            return s3;
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
