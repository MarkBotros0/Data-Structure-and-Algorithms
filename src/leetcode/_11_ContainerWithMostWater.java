package leetcode;

public class _11_ContainerWithMostWater {

    public static int maxArea(int[] height) {
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

    public static void main(String[] args) {
        int[] numbers = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(numbers));
    }
}
