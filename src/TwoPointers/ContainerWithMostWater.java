package TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while(left < right){
            int width = right - left;
            int currArea = width * Math.min(height[left], height[right]);

            maxWater = Math.max(currArea, maxWater);

            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
}
