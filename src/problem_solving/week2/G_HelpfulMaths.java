package problem_solving.week2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class G_HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] numbers = str.split("\\+");

        int[] ints = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            ints[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(ints);
        StringJoiner sj = new StringJoiner("+");

        for (int val : ints) {
            sj.add(Integer.toString(val));
        }

        System.out.println(sj.toString());
    }
}
