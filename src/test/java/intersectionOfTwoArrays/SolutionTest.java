package intersectionOfTwoArrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

    @Test
    void intersect() {
        int[] num2 = {1, 2, 3, 3, 1};
        int[] num1 = {1, 2, 3, 1, 3, 5, 6,};
        System.out.println(Arrays.toString(new Solution().intersect(num1, num2)));
    }
}