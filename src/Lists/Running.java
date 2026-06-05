package Lists;

public class Running {
    static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(2);

        l1.shift(0);

        System.out.println("Size: " + l1.size());
        System.out.println("Index of 3: " +l1.indexOf(3));

        l1.update(2,4);
        System.out.println("Deleted value: " + l1.delete(2));
        l1.print();
    }
}
