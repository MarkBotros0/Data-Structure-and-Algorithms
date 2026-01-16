package problem_solving.week4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class A_LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int shift = sc.nextInt();

        ArrayDeque<Integer> list = new ArrayDeque<>(n);

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < shift; i++) {
            list.add(list.getFirst());
            list.removeFirst();
        }

        for (Integer i:list){
            System.out.print(i + " ");
        }
    }
}
