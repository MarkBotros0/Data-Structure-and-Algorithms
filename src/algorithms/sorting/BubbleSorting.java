package algorithms.sorting;

import java.util.ArrayList;

public class BubbleSorting {

    // O(n^2)
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size()-1; j++) {
                arr = this.swapAdjacent(arr, j);
            }
        }
        return arr;
    }

    //    shifts 2 adjacent values in order to make the higher value in the higher index
    public ArrayList<Integer> swapAdjacent(ArrayList<Integer> arr, int index) {
        if (arr.get(index) > arr.get(index + 1)) {
            int temp = arr.get(index);
            arr.set(index, arr.get(index + 1));
            arr.set(index + 1, temp);
        }
        return arr;
    }

    public void testBubbleSort() {
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
        BubbleSorting sorter = new BubbleSorting();
        System.out.println(sorter.sort(arr));
    }
}
