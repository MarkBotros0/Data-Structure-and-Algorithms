package coach_academy_course.week4;

import java.util.Scanner;
import java.util.Stack;

public class D_QueueUsingTwoStacks_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queries = sc.nextInt();
        Stack<Long> stack1 = new Stack<>();
        Stack<Long> stack2 = new Stack<>();

        for (int i = 0; i < queries; i++) {
            int type = sc.nextInt();

            if (type == 1) {
                Long input = sc.nextLong();
                stack1.push(input);
            } else {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }

                if (type == 2) {
                    stack2.pop();
                } else if (type == 3) {
                    System.out.println(stack2.peek());
                }
            }
        }
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