package stack.arrayStack;

import array.MyArray;
import stack.Stack;

// LIFO -> Last in First out
public class MyArrStack<T> implements Stack {
    private MyArray<T> arr;

    public MyArrStack() {
        this.arr = new MyArray<>();
    }

    // O(1)
    @Override
    public T peek() {
        return arr.get(arr.getLength() - 1);
    }

    // O(1)
    @Override
    public T pop() {
        return arr.pop();
    }

    // O(1)
    @Override
    public Boolean isEmpty() {
        return arr.getLength() == 0;
    }

    // O(1)
    public void push(T input) {
        arr.push(input);
    }

    public void printList() {
        arr.printList();
    }

    public static void testStack(){
        MyArrStack<String> stack = new MyArrStack<>();
        stack.push("test");
        stack.push("hello");
        stack.push("My");
        stack.push("Name");
        stack.push("Mark");

        System.out.println(stack.peek());

        stack.printList();
        stack.pop();
        stack.pop();
        stack.printList();
        stack.pop();
        stack.pop();
//        stack.pop();

//        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
//        stack.printStack();
    }
}
