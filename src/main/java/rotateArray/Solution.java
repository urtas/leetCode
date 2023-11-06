package rotateArray;

import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            int number;
            if (nums.length - k + i < nums.length) {
                number = nums.length - k + i;
            } else {
                number = i - k;
            }
            nums[i] = result[number];
        }
        System.out.println(Arrays.toString(nums));
    }
}