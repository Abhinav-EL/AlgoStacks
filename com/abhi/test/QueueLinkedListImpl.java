package com.abhi.test;

public class QueueLinkedListImpl {
    /**
     * Top most & last node of the queue
     */
    Node head, tail;

    /**
     * Add to the top of queue
     * @param string
     */
    public void push(String string){
        Node newNode = new Node(string);
        if(isEmpty()) { // first node
            head = newNode;
            tail = head;
        } else {
            Node oldHead = head;
            oldHead.previous = newNode;
            head = newNode;
        }
    }

    /**
     * Remove the remove from top of queue
     * @return
     */
    public String pop(){
        if(isEmpty()) return null; //last node gone
        Node oldTail = tail;
        Node nextTail = tail.previous;
        tail = nextTail;
        return oldTail.string;
    }

    public Boolean isEmpty(){
        return tail==null;
    }

    /**
     * private class to represent the node object
     * Node stores its own data and reference to previous node
     */
    private class Node{
        String string;
        Node previous;

        public Node(String string){
            this.string = string;
        }

        public String toString(){
            return this.string;
        }
    }
}
