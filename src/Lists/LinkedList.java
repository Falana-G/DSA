package Lists;

public class LinkedList {
    Node head;

    public void insert(int a){
        Node n = new Node();
        n.data = a;

        if(head == null){
            head = n;
        }
        else{
            Node i = head;
            while (i.next != null){
                i = i.next;
            }
            i.next = n;
        }
    }

    public void shift(int a){
        Node n = new Node();
        n.data = a;

        if(head == null){
            head = n;
        }
        else {
            n.next = head;
            head = n;
        }
    }

    public int delete(int n){
        int val;
        if (n == 0) {
            val = head.data;
            head = null;
        }
        else{
            Node i = head;
            for (int j = 0; j < n-1; j++) {
                i = i.next;
            }
            val = i.next.data;
            i.next = i.next.next;
        }
        return val;
    }

    public void update(int old, int n){
        Node i = head;
        while(i != null){
            if(i.data == old){
                i.data = n;
            }
            i = i.next;
        }
    }

    public int size(){
        int count = 0;
        Node i = head;
        while(i != null){
            i = i.next;
            count++;
        }
        return count;
    }

    public int indexOf(int a){
        Node i = head;
        int count = 0;
        while (i != null){
            if(i.data == a){
                return count;
            }
            count++;
            i = i.next;
        }
        return -1;
    }

    public void Reverse(){

    }

    public void print(){
        Node i = head;
        System.out.print("Start");
        while (i != null){
            System.out.print("-->" + i.data);
            i = i.next;
        }
    }


}
