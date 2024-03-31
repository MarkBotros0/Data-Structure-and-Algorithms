package dataStructures.linkedList.doubleLinkedList;

public class DoubleNode<T> {
    private final T value;
    private DoubleNode<T> prevNode;
    private DoubleNode<T> nextNode;

    public T getValue() {
        return value;
    }

    public DoubleNode(T value){
        this.value = value;
    }
    public DoubleNode<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoubleNode<T> prevNode) {
        this.prevNode = prevNode;
    }

    public DoubleNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        String prevValue = this.prevNode != null ? this.prevNode.getValue().toString() : "NA";
        String nextValue = this.nextNode != null ? this.nextNode.getValue().toString() : "NA";

        return ("p:" + prevValue +
                "- v:" + this.value.toString() +
                "- n:" + nextValue + "\n"
        );
    }
}
