package com.abhi.test;

public class StackArrayImpl {
    private String[] arr = new String[10];
    private int size = 0;

    public void push(String newElement){
        arr[size++] = newElement;
    }

    public String pop(){
        if(size==0) return null;
        return arr[--size];
    }

    public Boolean isEmpty(){
        return size == 0;
    }
}
