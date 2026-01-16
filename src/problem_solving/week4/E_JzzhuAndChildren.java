package problem_solving.week4;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class E_JzzhuAndChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayDeque<Integer[]> children = new ArrayDeque<>();
        Stack<Integer> childrenLeft = new Stack<>();

        for (int i = 0; i < n; i++) {
            children.add(new Integer[]{sc.nextInt(), i + 1});
        }

        while (!children.isEmpty()) {
            int firstChildCandies = children.getFirst()[0];
            int firstChildIndex = children.getFirst()[1];

            children.removeFirst();
            if (m < firstChildCandies) {
                children.addLast(new Integer[]{firstChildCandies - m, firstChildIndex});
            } else {
                childrenLeft.push(firstChildIndex);
            }
        }
        System.out.println(childrenLeft.peek());
    }
}
/*

 */