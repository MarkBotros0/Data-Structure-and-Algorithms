package coach_academy_course.week5;

import java.util.*;

public class C_RegistrationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Map<String, Integer> nameSet = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            if (nameSet.containsKey(name)) {
                System.out.println(name + nameSet.get(name));
                nameSet.put(name, nameSet.get(name) + 1);
            } else {
                System.out.println("OK");
                nameSet.put(name, 1);
            }
        }
    }
}
