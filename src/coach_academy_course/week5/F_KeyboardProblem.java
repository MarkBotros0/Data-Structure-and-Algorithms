package coach_academy_course.week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class F_KeyboardProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dir = sc.next();
        String str = sc.next();
        Map<Character, char[]> nameSet = new HashMap<>();

        nameSet.put('q', new char[]{' ', 'e'});
        nameSet.put('w', new char[]{'q', 'e'});
        nameSet.put('e', new char[]{'w', 'r'});
        nameSet.put('r', new char[]{'e', 't'});
        nameSet.put('t', new char[]{'r', 'y'});
        nameSet.put('y', new char[]{'t', 'u'});
        nameSet.put('u', new char[]{'y', 'i'});
        nameSet.put('i', new char[]{'u', 'o'});
        nameSet.put('o', new char[]{'i', 'p'});
        nameSet.put('p', new char[]{'o', '['});
        nameSet.put('[', new char[]{'p', ']'});
        nameSet.put(']', new char[]{'[', ' '});
        nameSet.put('a', new char[]{' ', 's'});
        nameSet.put('s', new char[]{'a', 'd'});
        nameSet.put('d', new char[]{'s', 'f'});
        nameSet.put('f', new char[]{'d', 'g'});
        nameSet.put('g', new char[]{'f', 'h'});
        nameSet.put('h', new char[]{'g', 'j'});
        nameSet.put('j', new char[]{'h', 'k'});
        nameSet.put('k', new char[]{'j', 'l'});
        nameSet.put('l', new char[]{'k', ';'});
        nameSet.put(';', new char[]{'l', ' '});
        nameSet.put('z', new char[]{' ', 'x'});
        nameSet.put('x', new char[]{'z', 'c'});
        nameSet.put('c', new char[]{'x', 'v'});
        nameSet.put('v', new char[]{'c', 'b'});
        nameSet.put('b', new char[]{'v', 'n'});
        nameSet.put('n', new char[]{'b', 'm'});
        nameSet.put('m', new char[]{'n', ','});
        nameSet.put(',', new char[]{'m', '.'});
        nameSet.put('.', new char[]{',', '/'});
        nameSet.put('/', new char[]{'.', ' '});

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            int index = dir.equals("R") ? 0 : 1;
            sb.append(nameSet.get(c)[index]);
        }
        System.out.println(sb);
    }
}
