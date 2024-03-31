package dataStructures.binarySearchTree;

public class BSTNode<T extends Comparable<T>> implements Comparable<BSTNode<T>> {
    private T value;
    private BSTNode<T> right;
    private BSTNode<T> left;

    public BSTNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    @Override
    public int compareTo(BSTNode<T> other) {
        return this.value.compareTo(other.getValue());
    }
}
