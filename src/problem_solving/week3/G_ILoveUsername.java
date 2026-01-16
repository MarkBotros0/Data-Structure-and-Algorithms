package problem_solving.week3;

import java.util.Scanner;

public class G_ILoveUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];
        int counter = 0;

        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                counter++;
            } else if (arr[i] < min) {
                min = arr[i];
                counter++;
            }
        }

        System.out.print(counter);
    }
}
