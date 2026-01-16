package problem_solving.week2;

import java.util.*;

public class M_HonestCoach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<int[]> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            lists.add(arr);
        }

        for (int[] arr : lists) {
            Arrays.sort(arr);
            int diff = Integer.MAX_VALUE;
            for (int j = 0; j < arr.length - 1; j++) {
                diff = Math.min(Math.abs(arr[j] - arr[j+1]), diff);
            }
            System.out.println(diff);
        }
    }
}
