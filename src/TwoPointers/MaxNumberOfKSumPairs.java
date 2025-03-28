package TwoPointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int op = 0;
        while(left < right){
            if(nums[left] + nums[right] == k){
                op++;
                left++;
                right--;
            } else if(nums[left] + nums[right] < k){
                left++;
            } else {
                right--;
            }
        }
        return op;
    }
}
