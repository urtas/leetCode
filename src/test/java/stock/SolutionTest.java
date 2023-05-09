package stock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void stock() {
        Solution stock = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, stock.maxProfit(prices));
    }
}