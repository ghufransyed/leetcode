import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ghufran on 3/15/17.
 */
class Problem1TwoSumTest {
    @Test
    void twoSumtest1() {
        int[] nums = new int[]{2,7,11,15};
        assertArrayEquals(new int[]{0,1}, Problem1TwoSum.twoSum(nums, 9));

    }


    @Test
    void twoSumtest2() {

    }

}