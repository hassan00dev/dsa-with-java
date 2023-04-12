package DataStructures;

import java.util.Arrays;

public class Heap {

    private int[] items;
    private int size;
    private int last_node = 0;

    public Heap() {
        this.size = 10;
        this.items = new int[size];
    }

    public Heap(int size) {
        this.size = size;
        this.items = new int[size];
    }

    public void insert(int data) {
        if (isFull())
            //double the size of array like we did earlier in ArrayLists..
            throw new IllegalStateException();

        // Insert the data into the last node
        // and increment the size of the heap
        items[last_node++] = data;

        // if new value is grater than parent, we have to bubble up
        bubbleUp();

    }

    public boolean isFull() {
        return last_node == size;
    }

    public boolean isEmpty() {
        return last_node == 0;
    }

    public void remove() {

        if (isEmpty())
            return;

        // Remove the root node
        items[0] = 0;

        // Swap the nodes
        // Update the size of the heap
        swapNode(0, --last_node);

        // bubble down the node
        bubbleDown();
    }

    public int removeAndReturn() {
        var root = items[0];
        remove();
        return root;
    }

    private void bubbleUp() {
//    	(index - 1) / 2; this will give you the parent index
        int current_node = last_node - 1;
        while (current_node > 0 && items[current_node] > items[parent(current_node)]) {
            swapNode(current_node, parent(current_node));
            current_node = parent(current_node);
        }
    }

    private void bubbleDown() {
        int current_node = 0;
        int left = left(current_node);
        int right = right(current_node);

        while ((items[current_node] < items[left] || items[current_node] < items[right]) && right <= size) {
            if (items[left] > items[right]) {
                swapNode(left, current_node);
                current_node = left;
            }
            else {
                swapNode(right, current_node);
                current_node = right;
            }
            left = left(current_node);
            right = right(current_node);
        }
    }



    private void swapNode(int node1, int node2) {
        int tmp = items[node1];
        items[node1] = items[node2];
        items[node2] = tmp;
    }



    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index){
        return index * 2 + 1;
    }

    private int right(int index) {
        return index * 2 + 2;
    }



    @Override
    public String toString() {
        return "Heap [items=" + Arrays.toString(items) + ", size=" + size + ", last_node=" + last_node + "]";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Heap hp = new Heap();
        hp.insert(10);
        hp.insert(50);
        hp.insert(6);
        hp.insert(109);
        hp.insert(70);
        hp.insert(99);

        System.out.println(hp);
    }


}