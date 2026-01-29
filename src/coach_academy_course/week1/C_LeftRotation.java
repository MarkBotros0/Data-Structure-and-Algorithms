package coach_academy_course.week1;

import java.util.Scanner;

public class C_LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int shift = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] shiftedArr = new int[n];
        for (int i = 0; i < n; i++) {
            int newIndex = i - shift < 0 ? n - (shift - i) : i - shift;
            shiftedArr[newIndex] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(shiftedArr[i] + " ");
        }
    }
}
