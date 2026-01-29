package coach_academy_course.week5;

import java.util.*;

public class I_SortingQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Deque<Integer> queue = new ArrayDeque<>();
        Queue<Integer> sortedHeap = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();
            switch (query) {
                case 1:
                    queue.addLast(sc.nextInt());
                    break;
                case 2:
                    if (!sortedHeap.isEmpty()) {
                        sb.append(sortedHeap.poll()).append("\n");
                    } else {
                        sb.append(queue.pollFirst()).append("\n");
                    }
                    break;
                case 3:
                    while (!queue.isEmpty()) {
                        sortedHeap.add(queue.pollFirst());
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
