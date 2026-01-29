package coach_academy_course.week4;

import java.util.*;

public class C_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ops = sc.nextInt();
        Stack<String> history = new Stack<>();
        String curr = "";
        history.push(curr);
        Queue<Character> charsQueue = new LinkedList<>();

        for (int i = 0; i < ops; i++) {
            int operation = sc.nextInt();
            curr = history.peek();

            switch (operation) {
                case 1:
                    curr += sc.next();
                    history.add(curr);
                    break;
                case 2:
                    int charsToDelete = sc.nextInt();
                    curr = curr.substring(0, curr.length() - charsToDelete);
                    history.add(curr);
                    break;
                case 3:
                    int indexToPrint = sc.nextInt();
                    charsQueue.add(curr.charAt(indexToPrint - 1));
                    break;
                case 4:
                    if (!history.empty()) {
                        history.pop();
                    }
                    break;
            }
        }
        while (!charsQueue.isEmpty()) {
            System.out.println(charsQueue.poll());
        }
    }
}
