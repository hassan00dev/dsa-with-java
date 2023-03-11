package test;

public class ArrayQueue<T> {
    public class Node{
        private T data;
        private Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(int T) {
            this.data = data;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public void enqueue(T value){
        Node n = new Node(value);
        if(head == null && tail == null){
            head = tail = n;
        }
    }
}
