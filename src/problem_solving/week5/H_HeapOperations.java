package problem_solving.week5;

import java.util.*;

public class H_HeapOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<String> stack = new Stack<>();
        Map<String, Boolean> printedMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (!printedMap.containsKey(name)) {
                printedMap.put(name, false);
            }
            stack.push(name);
        }

        while (!stack.isEmpty()){
            if (!printedMap.get(stack.peek())){
                System.out.println(stack.peek());
                printedMap.put(stack.peek(), true);
            }
            stack.pop();
        }
    }
}

/*
4
alex
ivan
roman
ivan
 */
