package DataStructures.PriorityQueue;

public class Node {
    private int data;
    private int priority;
    private Node nextAddress;

    public Node(int d, int p) {
        this.data = d;
        this.priority = p;
        this.nextAddress = null;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public Node getNextAddress() {
        return nextAddress;
    }
    public void setNextAddress(Node nextAddress) {
        this.nextAddress = nextAddress;
    }


}
