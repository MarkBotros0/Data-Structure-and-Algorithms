import myLinkedList.doubleLinkedList.DoubleLinkedList;
import myLinkedList.single.SingleLinkedList;

public class Main {

    public static void main(String[] args) {
//        testSingleList();
        testDoublesList();
    }

    private static void testSingleList(){
        SingleLinkedList<String> list = new SingleLinkedList<>();

        list.append("testing");
        list.append("dod");
        list.append("hello");
        list.append("mark");
        list.append("Botros");
        list.prepend("1");
        list.prepend("2");
        list.prepend("3");

        list.printList();

        list.insert(3,"alooo");
        list.insert(100,"bisho");
        list.printList();

        list.delete(3);
        list.delete(5);
        list.printList();

        System.out.println(list.getLength());
    }

    private static void testDoublesList(){
        DoubleLinkedList<String> list = new DoubleLinkedList<>();

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

        list.delete(3);
        list.delete(5);
        list.printList();

        System.out.println(list.getLength());
    }
}