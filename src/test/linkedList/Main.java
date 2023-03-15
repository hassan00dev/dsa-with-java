package test.linkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(5);
        list.add(35);
        list.add(34);
        list.add(32);
        list.add(34);


        list.remove(434);

        list.display();
    }
}
