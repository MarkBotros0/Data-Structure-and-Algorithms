package linkedList.doubleLinkedList;

import java.util.ArrayList;

public class MyDoubleLinkedList<T> {
    private int length;
    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    public int getLength() {
        return length;
    }

    // O(1)
    public void append(T element) {
        DoubleNode<T> newNode = new DoubleNode<>(element);

        if(length == 0 ){
            this.head = newNode;
        } else {
            newNode.setPrevNode(this.tail);
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;
        this.length++;
    }

    // O(1)
    public void prepend(T element) {
        DoubleNode<T> newNode = new DoubleNode<>(element);

        if(length == 0 ){
            this.tail = newNode;
        } else {
            newNode.setNextNode(this.head);
            this.head.setPrevNode(newNode);
        }
        this.head = newNode;
        this.length++;
    }

    // O(n)
    public void insert(int index, T element) {
        if(index > this.length - 1){
            this.append(element);
        } else {
            DoubleNode<T> newNode = new DoubleNode<>(element);
            DoubleNode<T> before = this.traverse(index - 1);
            DoubleNode<T> after = before.getNextNode();

            newNode.setPrevNode(before);
            newNode.setNextNode(after);
            before.setNextNode(newNode);
            after.setPrevNode(newNode);
        }
        this.length++;
    }

    // O(n)
    public Boolean search(T searchValue){
        DoubleNode<T> currNode = this.head;
        while (currNode != null){
            if (currNode.getValue() == searchValue){
                return true;
            }
            currNode = currNode.getNextNode();
        }
        return false;
    }

    // O(n)
    private DoubleNode<T> traverse(int index) {
        DoubleNode<T> currNode = this.head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.getNextNode();
        }
        return currNode;
    }

    // O(1)
    public void delete (int index){
        DoubleNode<T> nodeToDelete = this.traverse(index);

        nodeToDelete.getPrevNode().setNextNode(nodeToDelete.getNextNode());
        nodeToDelete.getNextNode().setPrevNode(nodeToDelete.getPrevNode());
        this.length--;
    }
    public void printList() {
        ArrayList<String> list = new ArrayList<>();
        DoubleNode<T> currNode = this.head;
        while (currNode != null){
            list.add(currNode.toString());
            currNode = currNode.getNextNode();
        }
        System.out.println(list);
    }
    public static void testList() {
        MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();

        list.append("testing");
        list.append("dod");
        list.append("hello");
        list.append("mark");
        list.append("Botros");
        list.prepend("1");

        list.printList();

        list.insert(3,"alooo");
        list.insert(100,"bisho");
        list.printList();
        System.out.println(list.search("alooo"));
        list.delete(3);
        list.delete(5);
        list.printList();

        System.out.println(list.getLength());
    }
}
