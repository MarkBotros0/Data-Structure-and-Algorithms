package problem_solving.week3;

import java.util.Scanner;

public class J_Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int minCap = 0;
        int currCap = 0;

        for (int i = 0; i < n; i++) {
            currCap -= sc.nextInt();
            currCap += sc.nextInt();
            minCap = Math.max(minCap, currCap);
        }
        System.out.println(minCap);
    }
}
