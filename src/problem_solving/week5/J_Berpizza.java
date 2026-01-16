package problem_solving.week5;

import java.util.*;

public class J_Berpizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> arr = new Vector<>();
        Set<Integer> indexSet = new HashSet<>();
        int indexCount = 1;

        Queue<int[]> sortedHeap = new PriorityQueue<>((a,b) -> a[0] != b[0] ?
                Integer.compare(b[0], a[0]) : Integer.compare(a[1], b[1]));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();
            switch (query) {
                case 1:
                    int amount = sc.nextInt();
                    arr.add(amount);
                    sortedHeap.add(new int[]{amount, arr.size()});
                    break;
                case 2:
                    while (indexSet.contains(indexCount)) {
                        indexCount++;
                    }
                    indexSet.add(indexCount);
                    sb.append(indexCount).append(" ");
                    break;
                case 3:
                    while (indexSet.contains(sortedHeap.peek()[1])) {
                        sortedHeap.poll();
                    }
                    sb.append(sortedHeap.peek()[1]).append(" ");
                    indexSet.add(sortedHeap.poll()[1]);
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