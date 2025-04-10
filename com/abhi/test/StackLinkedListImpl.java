package com.abhi.test;

import java.util.Iterator;

/**
 * LIFO implementation of LinkedList
 */
public class StackLinkedListImpl implements Iterable<String>{
    /**
     * Top most node of the stack (head)
     */
    Node head;

    /**
     * Add to the front of stack
     * @param string
     */
    public void Push(String string){
        Node newNode = new Node(string);
        Node oldHead = head;
        newNode.last = oldHead;
        head = newNode;
    }

    /**
     * Remove the head of stack
     * @return
     */
    public String Pop(){
        if(isEmpty()) return null;
        String oldHeadStr = head.string;
        head = head.last;
        return oldHeadStr;
    }

    public Boolean isEmpty(){
        return head==null;
    }

    /**
     * private class to represent the node object
     * Node stores its own data and reference to previous node
     */
    private class Node{
        String string;
        Node last;

        public Node(String string){
            this.string = string;
        }

        public String toString(){
            return this.string;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new SLLIterator();
    }

    public class SLLIterator implements Iterator<String>{
        Node current = head;

        @Override
        public boolean hasNext() {
            return current !=null;
        }

        @Override
        public String next() {
            String str = current.toString();
            current = current.last;
            return str;
        }
    }
}
