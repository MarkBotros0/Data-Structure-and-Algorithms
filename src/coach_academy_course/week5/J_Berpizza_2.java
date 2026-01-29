package coach_academy_course.week5;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class J_Berpizza_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] isServed = new boolean[n + 1];
        int customerCounter = 1;
        int monocarpCount = 1;

        Queue<int[]> polycarpOrder = new PriorityQueue<>((a,b) -> a[0] != b[0] ?
                Integer.compare(b[0], a[0]) : Integer.compare(a[1], b[1]));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();
            switch (query) {
                case 1:
                    int amount = sc.nextInt();
                    polycarpOrder.add(new int[]{amount, customerCounter++});
                    break;
                case 2:
                    while (isServed[monocarpCount]) {
                        monocarpCount++;
                    }
                    isServed[monocarpCount] = true;
                    sb.append(monocarpCount).append(" ");
                    break;
                case 3:
                    while (isServed[polycarpOrder.peek()[1]]) {
                        polycarpOrder.poll();
                    }
                    int[] top = polycarpOrder.poll();
                    int topIndex = top[1];
                    sb.append(topIndex).append(" ");
                    isServed[topIndex] = true;
                    break;
            }
        }
        System.out.println(sb);
    }
}

/*
6
1 8
1 10
1 8
3
3
3
 */