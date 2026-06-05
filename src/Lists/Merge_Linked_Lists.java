package Lists;

public class Merge_Linked_Lists {
    static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);

        LinkedList l2 = new LinkedList();
        l2.insert(5);
        l2.insert(6);
        l2.insert(7);
        l2.insert(8);

        Merge(l1.head, l2.head);

        print(l1.head);
    }

    public static void Merge(Node s1, Node s2){
        Node i = s1;
        while(i.next != null){
            i=i.next;
        }
        i.next = s2;
    }

    public static void print(Node head){
        Node i = head;
        System.out.print("Start");
        while (i != null){
            System.out.print("-->" + i.data);
            i = i.next;
        }
    }
}
