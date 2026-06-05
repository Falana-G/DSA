package Lists;

public class Get_Element {
    static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(2);

        int i = getElementAt(3, l1.head);
        System.out.println(i);
    }

    public static int getElementAt(int n, Node head){
        Node i = head;
        for (int j = 0; j < n; j++) {
            i = i.next;
        }
        return i.data;
    }
}
