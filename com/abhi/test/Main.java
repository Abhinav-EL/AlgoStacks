package com.abhi.test;

public class Main {

    public static void main(String[] args) {
        StackLinkedListImpl linkedList = new StackLinkedListImpl();

        System.out.println("Is empty: "+linkedList.isEmpty());

        linkedList.Push("Testing");
        linkedList.Push("In");
        linkedList.Push("Progress");

        System.out.println("Still is empty: "+linkedList.isEmpty());
        System.out.println("Starting iteration-");
        for(String str: linkedList){
            System.out.println(str);
        }
        System.out.println("Pop: "+linkedList.Pop());
        System.out.println("Pop: "+linkedList.Pop());
        System.out.println("Pop: "+linkedList.Pop());

        System.out.println("Pop: "+linkedList.Pop());
        System.out.println("Empty now: "+linkedList.isEmpty());

        //----------****-------//
        System.out.println("------Doing the Array impl test------");
        StackArrayImpl stacks = new StackArrayImpl();

        System.out.println("Is empty: "+stacks.isEmpty());

        stacks.push("Testing");
        stacks.push("In");
        stacks.push("Progress");

        System.out.println("Still is empty: "+stacks.isEmpty());
        System.out.println("Pop: "+stacks.pop());
        System.out.println("Pop: "+stacks.pop());
        System.out.println("Pop: "+stacks.pop());

        System.out.println("Pop: "+stacks.pop());
        System.out.println("Empty now: "+stacks.isEmpty());

        //----------****-------//
        System.out.println("------Doing the Queue Linked List impl test------");
        QueueLinkedListImpl queue = new QueueLinkedListImpl();

        System.out.println("Is empty: "+queue.isEmpty());

        queue.push("Testing");
        queue.push("In");
        queue.push("Progress");

        System.out.println("Still is empty: "+queue.isEmpty());
        System.out.println("Pop: "+queue.pop());
        System.out.println("Pop: "+queue.pop());
        System.out.println("Pop: "+queue.pop());

        System.out.println("Pop: "+queue.pop());
        System.out.println("Empty now: "+queue.isEmpty());

        //----------****-------//
        System.out.println("------Doing the Queue Array impl test------");
        QueueArrayImpl queueArr = new QueueArrayImpl();

        System.out.println("Is empty: "+queueArr.isEmpty());

        queueArr.push("Testing");
        queueArr.push("In");
        queueArr.push("Progress");

        System.out.println("Still is empty: "+queueArr.isEmpty());

        System.out.println("Starting iteration-");
        for(String str: queueArr){
            System.out.println(str);
        }
        System.out.println("Pop: "+queueArr.pop());
        System.out.println("Pop: "+queueArr.pop());
        System.out.println("Pop: "+queueArr.pop());

        System.out.println("Pop: "+queueArr.pop());
        System.out.println("Empty now: "+queueArr.isEmpty());

        //----------****-------//
        System.out.println("------Doing the Array impl test------");
        TestStackWithMax maxStack = new TestStackWithMax();

        System.out.println("Is empty: "+maxStack.isEmpty());

        maxStack.push(3);
        maxStack.push(10);
        maxStack.push(5);
        maxStack.push(10);
        maxStack.push(20);
        System.out.println("Max: "+maxStack.getMax());

        System.out.println("Still is empty: "+maxStack.isEmpty());
        System.out.println("Pop: "+maxStack.pop());
        System.out.println("Max: "+maxStack.getMax());
        System.out.println("Pop: "+maxStack.pop());
        System.out.println("Max: "+maxStack.getMax());
        System.out.println("Pop: "+maxStack.pop());
        System.out.println("Max: "+maxStack.getMax());
        System.out.println("Pop: "+maxStack.pop());
        System.out.println("Max: "+maxStack.getMax());
        System.out.println("Pop: "+maxStack.pop());
        System.out.println("Max: "+maxStack.getMax());
        System.out.println("Empty now: "+maxStack.isEmpty());
    }
}
