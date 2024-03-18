package linkedList.single;

import java.util.ArrayList;

public class MySingleLinkedList<T> {
    private int length;
    private SingleNode<T> head;
    private SingleNode<T> tail;

    public void append(T element) {
        SingleNode<T> newNode = new SingleNode<>(element);

        if (length == 0) {
            this.head = newNode;
        } else {
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;
        this.length++;
    }

    public int getLength() {
        return length;
    }

    public void prepend(T element) {
        SingleNode<T> newNode = new SingleNode<>(element);

        if (length == 0) {
            this.tail = newNode;
        } else {
            newNode.setNextNode(this.head);
        }
        this.head = newNode;
        this.length++;
    }

    public void insert(int index, T element) {
        SingleNode<T> newNode = new SingleNode<>(element);
        if (index > this.length - 1) {
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        } else {
            SingleNode<T> before = this.traverse(index - 1);
            SingleNode<T> after = before.getNextNode();

            newNode.setNextNode(after);
            before.setNextNode(newNode);
        }
        this.length++;
    }

    private SingleNode<T> traverse(int index) {
        SingleNode<T> currNode = this.head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.getNextNode();
        }
        return currNode;
    }

    public void delete(int index) {
        SingleNode<T> nodeBeforeNodeTDelete = this.traverse(index - 1);
        SingleNode<T> nodeToDelete = nodeBeforeNodeTDelete.getNextNode();

        nodeBeforeNodeTDelete.setNextNode(nodeToDelete.getNextNode());
        this.length--;
    }

    public void printList() {
        ArrayList<String> list = new ArrayList<>();
        SingleNode<T> currNode = this.head;
        while (currNode != null) {
            list.add(currNode.toString());
            currNode = currNode.getNextNode();
        }
        System.out.println(list);
    }

    public static void testList() {
        MySingleLinkedList<String> list = new MySingleLinkedList<>();

        list.append("testing");
        list.append("dod");
        list.append("hello");
        list.append("mark");
        list.append("Botros");
        list.prepend("1");
        list.prepend("2");
        list.prepend("3");

//        list.printList();

        list.insert(3, "alooo");
        list.insert(100, "bisho");
        list.printList();

        list.delete(3);
        list.delete(5);
        list.printList();

        System.out.println(list.getLength());
    }
}
