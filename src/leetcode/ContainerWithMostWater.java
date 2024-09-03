package leetcode;

//11
public class ContainerWithMostWater implements TestSolution {

    public int maxArea(int[] height) {
        int firstIndex = 0;
        int lastIndex = height.length - 1;
        int maxArea = 0;
        while (firstIndex < lastIndex) {
            int area = (lastIndex - firstIndex) * Math.min(height[firstIndex], height[lastIndex]);
            if (area > maxArea) {
                maxArea = area;
            } else {
                if (height[lastIndex] > height[firstIndex]){
                    firstIndex++;
                }else {
                    lastIndex--;
                }
            }
        }
        return maxArea;
    }

    @Override
    public void test() {
        int[] numbers = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(numbers));
    }
}
