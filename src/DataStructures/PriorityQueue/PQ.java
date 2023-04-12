package DataStructures.PriorityQueue;

public class PQ {
    private Node first;
    private Node last;
    private int count;

    public PQ() {
        this.first = this.last = null;
        this.count = 0;
    }//cons

    public void enqueue(int d, int p) {
        Node n = new Node(d,p);
        count++;
        //agar list empty hai
        if(first == null && last == null) {
            first = last = n;
        }

        //agar list empty ni hai...

        //agar new node ki priority first se kamm hai..
        else if(p<first.getPriority()) {
            n.setNextAddress(first);
            first = n;
        }
        //agar new node ki priority last se zyada hai..
        else if(p>last.getPriority()) {
            last.setNextAddress(n);
            last = n;
        }
        //age in between fall karti hai
        else {
            Node pre = first;
            Node cur = first.getNextAddress();

            while(pre.getNextAddress() != last) {
                if(pre.getPriority() < p && cur.getPriority() > p) {
                    pre.setNextAddress(n);
                    n.setNextAddress(cur);
                }//if
                cur = cur.getNextAddress();
                pre = pre.getNextAddress();
            }
        }//else agr list empty ni hai wala case

    }//enqueue


    public int dequeue() {
        Node sec = first.getNextAddress();
        int res = first.getData();
        first.setNextAddress(null);
        first = sec;
        return res;
    }

    public void print() {
        Node cur = first;
        while(cur != null) {
            System.out.print(cur.getData()+" -> ");
            cur = cur.getNextAddress();
        }
    }



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PQ p = new PQ();
        p.enqueue(10, 5);
        p.enqueue(70, 6);
        p.enqueue(18, 8);
        p.enqueue(54, 2);
        p.enqueue(99, 0);
        p.print();
        System.out.println();
        System.out.println(p.dequeue());

        System.out.println();
        p.print();
    }

}