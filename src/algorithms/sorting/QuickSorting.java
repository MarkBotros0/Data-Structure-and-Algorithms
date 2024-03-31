package algorithms.sorting;

import java.util.ArrayList;

public class QuickSorting {

    // O(nlog(n))
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return arr;
        }
        ArrayList<Integer> left = new ArrayList<>(arr.subList(0, arr.size() / 2));
        ArrayList<Integer> right = new ArrayList<>(arr.subList(arr.size() / 2, arr.size()));

        return merge(sort(left), sort(right));
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> arr = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                arr.add(left.get(leftIndex));
                leftIndex++;
            } else {
                arr.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        arr.addAll(left.subList(leftIndex, left.size()));
        arr.addAll(right.subList(rightIndex, right.size()));
        return arr;
    }

    public void testMergeSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(99);
        arr.add(44);
        arr.add(6);
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(63);
        arr.add(87);
        arr.add(283);
        arr.add(4);
        arr.add(0);
        System.out.println(arr);
        QuickSorting sorter = new QuickSorting();
        System.out.println(sorter.sort(arr));
    }

}
