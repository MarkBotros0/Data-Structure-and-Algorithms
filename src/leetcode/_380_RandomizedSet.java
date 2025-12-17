package leetcode;

import java.util.*;

//  380
public class _380_RandomizedSet {
    private final Map<Integer, Integer> map;
    private final List<Integer> array;

    public _380_RandomizedSet() {
        this.map = new HashMap<>();
        this.array = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        array.add(val);
        map.put(val, array.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        int arrayLastElement = array.get(array.size() - 1);
        array.set(index, arrayLastElement);
        map.put(arrayLastElement, index);
        array.remove(array.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random rand = new Random();
        return array.get(rand.nextInt(array.size()));
    }

    public static void main(String[] args) {
        _380_RandomizedSet obj = new _380_RandomizedSet();
        boolean param_1 = obj.remove(0);
        boolean param_2 = obj.remove(0);
        boolean param_3 = obj.insert(0);
        int param_4 = obj.getRandom();
        boolean param_5 = obj.remove(0);
        boolean param_6 = obj.insert(0);
        System.out.println(param_1 + " " + param_2 + " " + param_3 + " " + param_4 + " " + param_5 + " " + param_6);
    }
}
