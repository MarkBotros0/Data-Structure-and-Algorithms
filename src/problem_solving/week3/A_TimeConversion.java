package problem_solving.week3;

import java.util.Scanner;

public class A_TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String time = sc.next();

        String amOrPm = time.substring(8);
        String hour = time.substring(0, 2);

        if (amOrPm.equals("AM")) {
            if (hour.equals("12")) {
                hour = "00";
                System.out.println(hour + time.substring(2, 8));
            } else {
                System.out.println(time.substring(0, 8));
            }
        } else {
            if (hour.equals("12")) {
                System.out.println(time.substring(0, 8));
            } else {
                int hourParsed = Integer.parseInt(hour);
                System.out.println(Integer.toString(hourParsed + 12) + time.substring(2, 8));
            }
        }
    }
}
