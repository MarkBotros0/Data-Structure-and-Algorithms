package problem_solving.week5;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class G_Potions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        long current = 0;

        for (int i = 0; i < n; i++) {
            long nextVal = sc.nextLong();
            current += nextVal;
            queue.add(nextVal);

            if (current < 0) {
                current -= queue.poll();
            }
        }
        System.out.println(queue.size());
    }
}
