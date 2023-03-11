package test;

public class DDL {
    class Node {
        public double data;
        public Node next;
        public Node previous;

        public Node(double data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    private int count = 0;

    public void add(double data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            if (size() == 1) {
                first.next = node;
                last = node;
                last.previous = first;
            } else {
                // > 2
                node.previous = last;
                last.next = node;
                last=node;
            }
        }
        count++;
    }

    public double get(int index){
        int counter = 0;
        Node current = first;
        while(current != null){
            if (counter == index){
                return current.data;
            }
            current = current.next;
            counter++;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return first == null && last == null && size() == 0;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        String str = "";
        Node current = first;
        if (current == null)
            return "Empty!";
        while (current != null) {
            str += current.data + " ";
            current = current.next;
        }
        return str;
    }
}
