package algorithms.sorting;

import java.util.ArrayList;

public class InsertionSorting {

    // O(n^2)
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(0) > arr.get(i)) {
                arr.add(0,arr.get(i));
                arr.remove(i+1);
            } else {
                for (int j = 1; j < i; j++) {
                    if (arr.get(i) < arr.get(j) && arr.get(i) > arr.get(j-1)){
                        arr = this.swapElements(arr,i,j);
                    }
                }
            }
        }
        return arr;
    }

    //    shifts 2 values in order to make the higher value in the higher index
    public ArrayList<Integer> swapElements(ArrayList<Integer> arr, int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
        return arr;
    }

    public void testInsertionSort() {
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
        InsertionSorting sorter = new InsertionSorting();
        System.out.println(sorter.sort(arr));
    }

}


