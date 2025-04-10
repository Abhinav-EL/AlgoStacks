package com.abhi.test;

import java.util.Iterator;

public class QueueArrayImpl implements Iterable<String>{
    private String[] arr = new String[10];
    private int head = 0;
    private int tail = 0;

    public void push(String newElement){
        if(isEmpty()) {arr[head] = newElement; ++tail;}
        else {arr[tail++] = newElement;}
    }

    public String pop(){
        if(isEmpty()) return null;
        return arr[head++];
    }

    public Boolean isEmpty(){
        return tail == 0;
    }

    @Override
    public Iterator<String> iterator() {
        return new QAIterator();
    }

    public class QAIterator implements Iterator<String>{
        public int current = head;

        @Override
        public boolean hasNext() {
            return current != tail;
        }

        @Override
        public String next() {
            return arr[current++];
        }
    }
}
