package SlidingWindow;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int zeroes = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroes++;
            }
            while(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            maxOnes = Math.max(maxOnes, right-left+1);
        }
        return maxOnes;
    }
}
