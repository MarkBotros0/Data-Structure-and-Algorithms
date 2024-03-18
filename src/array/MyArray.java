package array;

import java.util.HashMap;

public class MyArray<T> {
    private int length;
    private final HashMap<Integer, T> data;

    public MyArray() {
        this.data = new HashMap<>();
        this.length = 0;
    }

    public T get(int index) {
        if (index >= length) {
            System.out.println("No Elements were found at index: " + index);
        }
        return this.data.get(index);
    }

    public void push(T input) {
        data.put(length, input);
        this.length++;
    }

    public void pop() {
        this.data.remove(this.length - 1);
        this.length--;
    }

    public void insert(int index, T input) {
        this.shiftItemsForwards(index);
        this.data.put(index, input);
    }

    public void delete(int index) {
        this.shiftItemsBackwards(index);
        this.data.remove(this.length - 1);
        this.length--;
    }

    private void shiftItemsBackwards(int index) {
        for (int i = index; i < this.length - 1; i++) {
            this.data.replace(i, this.data.get(i + 1));
        }
    }

    private void shiftItemsForwards(int index) {
        this.data.put(this.length, this.data.get(length - 1));
        for (int i = this.length; i > index; i--) {
            this.data.replace(i, this.data.get(i - 1));
        }
    }

    public void printList() {
        StringBuilder array = new StringBuilder();
        array.append("length: ").append(this.length).append(", ").append("[");
        if (this.length > 0) {
            data.forEach((key, value) -> array.append(key).append(":").append(value).append(","));
            array.deleteCharAt(array.length() - 1);
        }
        array.append("]");
        System.out.println(array);
    }

    public static void testList() {
        MyArray<String> array = new MyArray<>();
        array.push("test");
        array.push("hello");
        array.push("mark");
        array.push("help");
        array.push("derx");
        array.push("cool");
        array.push("rush");
        array.pop();
        array.delete(2);
        array.insert(3, "loozz");
        array.printList();
        System.out.println(array.get(2));
    }
}
