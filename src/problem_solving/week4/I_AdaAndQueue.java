package problem_solving.week4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class I_AdaAndQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        boolean isReversed = false;

        for (int i = 0; i < n; i++) {
            String opt = sc.next();

            switch (opt) {
                case "back":
                    if (!deque.isEmpty()) {
                        if (!isReversed) {
                            System.out.println(deque.getLast());
                            deque.removeLast();
                        } else {
                            System.out.println(deque.getFirst());
                            deque.removeFirst();
                        }
                    } else {
                        System.out.println("No job for Ada?");
                    }
                    break;
                case "front":
                    if (!deque.isEmpty()) {
                        if (!isReversed) {
                            System.out.println(deque.getFirst());
                            deque.removeFirst();
                        } else {
                            System.out.println(deque.getLast());
                            deque.removeLast();
                        }
                    } else {
                        System.out.println("No job for Ada?");
                    }
                    break;
                case "reverse":
                    isReversed = !isReversed;
                    break;
                case "push_back":
                    Integer elementToAddBack = sc.nextInt();
                    if (!isReversed) {
                        deque.addLast(elementToAddBack);
                    } else {
                        deque.addFirst(elementToAddBack);
                    }
                    break;
                case "toFront":
                    Integer elementToAddFront = sc.nextInt();
                    if (!isReversed) {
                        deque.addFirst(elementToAddFront);
                    } else {
                        deque.addLast(elementToAddFront);
                    }
                    break;
            }
        }
    }
}

/*
15
toFront 93
front
back
reverse
back
reverse
toFront 80
push_back 53
push_back 50
front
front
reverse
push_back 66
reverse
front

 */
