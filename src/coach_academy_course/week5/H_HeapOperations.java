package coach_academy_course.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class H_HeapOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();
            switch (operation) {
                case "insert":
                    int insertVal = sc.nextInt();
                    insert(queue, insertVal, result);
                    break;
                case "removeMin":
                    removeMin(queue, result);
                    break;
                case "getMin":
                    int getVal = sc.nextInt();
                    getMin(queue, getVal, result);
                    break;
            }
        }
        System.out.println(result.size());
        for (String record : result) {
            System.out.println(record);
        }
    }

    private static void insert(PriorityQueue<Integer> queue, int val, List<String> result) {
        queue.add(val);
        result.add("insert " + val);
    }

    private static void getMin(PriorityQueue<Integer> queue, int val, List<String> result) {
        while (!queue.isEmpty() && queue.peek() < val) {
            queue.poll();
            result.add("removeMin");
        }

        if (queue.isEmpty() || queue.peek() > val) {
            queue.add(val);
            result.add("insert " + val);
        }

        result.add("getMin " + val);
    }

    private static void removeMin(PriorityQueue<Integer> queue, List<String> result) {
        if (queue.isEmpty()) {
            queue.add(0);
            result.add("insert 0");
        }
        queue.poll();
        result.add("removeMin");
    }
}

/*
4
insert 1
insert 1
removeMin
getMin 2

--------------------
2
insert 3
getMin 4

 */
