package leetcode;

public class _27_RemoveElement implements TestSolution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    @Override
    public void test() {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }
}
