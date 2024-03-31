package dataStructures.stack;

public interface Stack<T> {
    public T peek();
    public void push(T input);
    public T pop();
    public Boolean isEmpty();
}
