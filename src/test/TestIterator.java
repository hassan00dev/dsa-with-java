package test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Maria");
        list.add("George");
        list.add("Henry");
        list.add("Sarah");
        list.add("Martin");
        list.add("Albert");
        list.add("Daniel");
        list.add("Brian");
        list.add("Henry");
        list.add("Nicholas");
        list.add("Esther");
        list.add("Tim");
        list.add("Ned");
        list.add("Barbara");
        list.add("Steve");
        list.add("Alex");

        ListIterator<String> iterator = list.listIterator();
//        a(iterator);
//        c(iterator);
        for (int i = 0; i < 12; i++) {
            System.out.println(iterator.next());
        }
        iterator.remove();
        iterator.add("Henry");
        System.out.println(list);
    }

    public static void a(ListIterator iterator){
        System.out.println(iterator.hasPrevious());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        iterator.remove();
    }

    public static void c(ListIterator iterator){
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.previous());
        iterator.remove();
        System.out.println(iterator.next());
        iterator.remove();
    }
}
