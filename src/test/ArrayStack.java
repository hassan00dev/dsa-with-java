package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack<T> {
    private List<T> list;
    public ArrayStack(){
        list = new ArrayList<T>();
    }

    void push(T value){
        list.add(value);
    }

    T peek(){
        return list.get(list.size() - 1);
    }

    T pop(){
        return list.remove(list.size() - 1);
    }

    boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
