package com.abhi.test;

public class TestStackWithMax {
    private Integer[] arr = new Integer[10];
    private int size = 0;
    private int max = 0;

    public void push(Integer newElement){
        arr[size++] = newElement;
        if(newElement > arr[max]) max = size-1;
    }

    public Integer pop(){
        if(isEmpty()) return null;
        int currVal = arr[--size];
        if(max-1 == size) findNextMax();

        return currVal;
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    public Integer getMax(){
        return arr[max];
    }

    private void findNextMax(){
        if(isEmpty()) {max = 0; return;}
        int i = size;
        while(i != 0){
            if(arr[i]>arr[i-1]){
                max=i;
            }
            i--;
        }
    }
}
