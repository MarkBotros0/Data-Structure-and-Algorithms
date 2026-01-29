package coach_academy_course.week4;

import java.util.Scanner;
import java.util.Stack;

public class D_QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queries = sc.nextInt();
        Stack<Long> stack1 = new Stack<>();

        for (int i = 0; i < queries; i++) {
            int type = sc.nextInt();

            switch (type) {
                case 1:
                    Long input = sc.nextLong();
                    stack1 = reverseStack(stack1);
                    stack1.push(input);
                    stack1 = reverseStack(stack1);
                    break;
                case 2:
                    stack1.pop();
                    break;
                case 3:
                    System.out.println(stack1.peek());
                    break;
            }
        }
    }

    private static Stack<Long> reverseStack(Stack<Long> stack) {
        Stack<Long> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }
        return newStack;
    }
}

/*
10
1 42
2
1 14
3
1 28
3
1 60
1 78
2
2
--------------
6
1 1
1 2
1 3
2
1 4
3
*/