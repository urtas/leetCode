package singleNumber;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void singleNumber() {
        int[] nums = { 4,4, 5};
        System.out.println(new Solution().singleNumber(nums));
    }
}