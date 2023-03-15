package test.linkedList;

public class CustomLinkedList {

    public class Node {
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public int count = 0;

    public boolean isEmpty(){
        return count == 0;
    }

    public void add(int data){
        Node node = new Node(data);

        if(isEmpty()){
            head = node;
        }else{

            Node current = this.head;
            while(current != null){
                if(current.next == null){
                    current.next = node;
                    break;
                }
                current = current.next;
            }
        }

        count++;
    }

    public boolean remove(int data) {
        Node current = this.head;
        Node previous = null;
        while(current != null){
            if(current.data == data){
                if(previous != null){
                    previous.next = current.next;
                }else{
                    head = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        count--;
        return false;
    }

    public int get(int index){
        Node current = this.head;
        int i = 0;
        while(current != null){
            if(i == index) {
                return current.data;
            }
            current = current.next;
            i++;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void display(){
        // traverse
        Node current = this.head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
