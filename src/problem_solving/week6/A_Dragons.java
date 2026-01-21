package problem_solving.week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        List<int[]> dragonsLeft = new ArrayList<>();
        boolean flag1 = false;

        for (int i = 0; i < n; i++) {
            int dragonStrength = sc.nextInt();
            int bonus = sc.nextInt();
            dragonsLeft.add(new int[]{dragonStrength, bonus});
            if (dragonStrength < s) {
                flag1 = true;
            }
        }

        if (!flag1) {
            System.out.println("NO");
            return;
        }

        int index = 0;
        int size = dragonsLeft.size();

        while (!dragonsLeft.isEmpty()) {
            if (index >= dragonsLeft.size()) {
                index = 0;
                if (size == dragonsLeft.size()) {
                    break;
                } else {
                    size = dragonsLeft.size();
                }
            }

            if (dragonsLeft.get(index)[0] < s) {
                s += dragonsLeft.get(index)[1];
                dragonsLeft.remove(index);
            } else {
                index++;
            }
        }
        if (!dragonsLeft.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
