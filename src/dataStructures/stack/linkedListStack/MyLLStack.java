package dataStructures.stack.linkedListStack;

import dataStructures.linkedList.single.SingleNode;
import dataStructures.stack.Stack;

import java.util.ArrayList;

// LIFO -> Last in First out
public class MyLLStack<T> implements Stack<T> {
    private SingleNode<T> top;
    private SingleNode<T> bottom;
    private int length;

    public int getLength() {
        return length;
    }

    // O(1)
    @Override
    public T peek() {
        return this.top.getValue();
    }

    // O(1)
    @Override
    public void push(T input) {
        SingleNode<T> newNode = new SingleNode<>(input);
        if (this.bottom == null) {
            this.bottom = newNode;
            this.top = newNode;
        } else {
            SingleNode<T> holdingPointer = this.top;
            this.top = newNode;
            this.top.setNextNode(holdingPointer);
        }
        this.length++;
    }

    // O(1)
    @Override
    public T pop() {
        if (this.top == null) {
            return null;
        }
        SingleNode<T> holdingPointer = this.top;
        this.top = this.top.getNextNode();
        if (this.length == 1) {
            this.bottom = null;
        }
        this.length--;
        return holdingPointer.getValue();
    }

    // O(1)
    @Override
    public Boolean isEmpty() {
        return this.bottom == null;
    }

    public void printStack() {
        ArrayList<String> list = new ArrayList<>();
        SingleNode<T> currNode = this.top;
        while (currNode != null) {
            list.add(currNode.toString());
            currNode = currNode.getNextNode();
        }
        System.out.println(list);
    }

    public static void testStack() {
        MyLLStack<String> stack = new MyLLStack<>();
        stack.push("test");
        stack.push("hello");
        stack.push("My");
        stack.push("Name");
        stack.push("Mark");

//        System.out.println(dataStructures.stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        dataStructures.stack.pop();

//        System.out.println(dataStructures.stack.isEmpty());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
//        dataStructures.stack.printStack();
    }

}
