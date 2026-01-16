package neetcode;

import java.util.*;
import java.util.stream.Collectors;

public class _6_EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(List.of("Hello", "World"));
        System.out.println(decode(encode(arr)));
        List<String> arr1 = new ArrayList<>(List.of("", ""));
        System.out.println(decode(encode(arr1)));
        List<String> arr2 = new ArrayList<>(List.of());
        System.out.println(decode(encode(arr2)));
    }

    public static String encode(List<String> strs) {
        if ((strs.isEmpty())) return "";

        String result = strs.stream()
                .map(s -> s.isEmpty() ? "BLANK" : s)
                .collect(Collectors.joining("_DUMMY_VALUE_"));

        return result;
    }

    public static List<String> decode(String str) {
        if (str.isEmpty()) return Collections.emptyList();

        String[] arr = str.split("_DUMMY_VALUE_");
        List<String> list = Arrays.stream(arr)
                .map(s -> s.equals("BLANK") ? "" : s)
                .toList();

         return list;
    }
}
