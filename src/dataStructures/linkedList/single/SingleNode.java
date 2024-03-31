package dataStructures.linkedList.single;

public class SingleNode<T> {
    private T value;
    private SingleNode<T> nextNode;

    public SingleNode(T value){
        this.value = value;
    }
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SingleNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(SingleNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        String nextValue = this.nextNode != null ? this.nextNode.getValue().toString() : "NA";

        return ("v:" + this.value.toString() +
                "- n:" + nextValue + "\n"
        );

    }
}
