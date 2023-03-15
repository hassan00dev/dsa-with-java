package test;

public class ArrayQueue<T> {
    public static void main(String[] args) {
        ArrayQueue<String> q = new ArrayQueue<String>();
        q.enqueue("hassan");
        q.enqueue("hassan_2");
        q.enqueue("hassan_3");

        q.dequeue();

        q.display();
    }
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

    private Node top;

    public void enqueue(T value){
        Node n = new Node(value);
        if(top == null) {
            top = n;
        }else{
            Node current = this.top;
            while(current != null){
                if(current.next == null){
                    current.next = n;
                    break;
                }
                current = current.next;
            }
        }
    }

    public boolean dequeue(){
        Node current = this.top;
        Node previous;
        previous = null;
        while(current != null){
            if(current.next == null){
                if(previous == null){
                    top = null;
                    return true;
                }else{
                    previous.next = null;
                    return true;
                }
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public void display(){
        Node current = this.top;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
