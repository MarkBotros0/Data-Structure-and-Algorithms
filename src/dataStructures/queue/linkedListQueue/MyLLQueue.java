package dataStructures.queue.linkedListQueue;

import dataStructures.linkedList.single.SingleNode;

import java.util.ArrayList;

// FIFO -> First in First out
public class MyLLQueue<T> {
    private SingleNode<T> first;
    private SingleNode<T> last;
    private int length;

    public int getLength() {
        return length;
    }

    // O(1)
    public void enqueue(T input) {
        SingleNode<T> newNode = new SingleNode<>(input);
        if (this.first == null) {
            this.first = newNode;
        } else {
            this.last.setNextNode(newNode);
        }
        this.last = newNode;
        this.length++;
    }

    // O(1)
    public T dequeue() {
        if (this.first == null) {
            return null;
        }
        if (this.first == this.last) {
            this.last = null;
        }
        SingleNode<T> holdingPointer = this.first;
        this.first = this.first.getNextNode();
        this.length--;
        return holdingPointer.getValue();
    }

    // O(1)
    public T peek() {
        return this.first == null ? null : this.first.getValue();
    }

    // O(1)
    public Boolean isEmpty() {
        return this.first == null;
    }

    public void printQueue() {
        ArrayList<String> list = new ArrayList<>();
        SingleNode<T> currNode = this.first;
        while (currNode != null) {
            list.add(currNode.toString());
            currNode = currNode.getNextNode();
        }
        System.out.println(list);
    }

    public static void testQueue() {
        MyLLQueue<String> queue = new MyLLQueue<>();
        queue.enqueue("test");
        queue.enqueue("t1");
        queue.enqueue("t2");
        queue.enqueue("t3");
        queue.enqueue("t4");

        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.peek());

    }


}
