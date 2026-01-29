package coach_academy_course.week4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class G_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayDeque<Integer> set1 = new ArrayDeque<>();
        ArrayDeque<Integer> set2 = new ArrayDeque<>();
        ArrayDeque<Integer> set3 = new ArrayDeque<>();

        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            int nextElement = sc.nextInt();
                if (nextElement < 0) {
                    negativeCount++;
                    set1.addLast(nextElement);
                } else if (nextElement > 0) {
                    set2.addLast(nextElement);
                } else {
                    set3.addLast(nextElement);
                }
        }

        if (negativeCount % 2 == 0) {
            int lastNegativeElement = set1.getLast();
            set3.addLast(lastNegativeElement);
            set1.removeLast();
        }

        if (set2.isEmpty()){
            set2.addLast(set1.getLast());
            set1.removeLast();
            set2.addLast(set1.getLast());
            set1.removeLast();
        }

        printDeque(set1);
        printDeque(set2);
        printDeque(set3);
    }

    private static void printDeque(ArrayDeque<Integer> deque) {
        System.out.print(deque.size() + " ");
        for (Integer i: deque) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

/*
3
-1 2 0
--------------------
4
-1 -2 -3 0
 */
