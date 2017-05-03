import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ghufran on 3/19/17.
 */
class Problem004MedianOfTwoSortedArraysTest {
    @Test
    void findMedianSortedArrays1() {
        int[] t1 = new int[] {1,3};
        int[] t2 = new int[] {2};
        
        double result = Problem004MedianOfTwoSortedArrays.findMedianSortedArrays(t1,t2);
        assertEquals(2.0, result);
    }
    
    @Test
    void findMedianSortedArrays2() {
        int[] t1 = new int[] {1,2};
        int[] t2 = new int[] {3,4};

        double result = Problem004MedianOfTwoSortedArrays.findMedianSortedArrays(t1,t2);
        assertEquals(2.5, result);
    }

    @Test
    void findMedianSortedArrays3() {
        int[] t1 = new int[] {1,3,5,7,9};
        int[] t2 = new int[] {2,4,6,8,10};

        double result = Problem004MedianOfTwoSortedArrays.findMedianSortedArrays(t1,t2);
        assertEquals(5.5, result);
    }
    
    @Test
    void findMedianSortedArrays4() {
        int[] t1 = new int[] {1,3,5,7,9};
        int[] t2 = new int[] {1};

        double result = Problem004MedianOfTwoSortedArrays.findMedianSortedArrays(t1,t2);
        assertEquals(4.0, result);
    }

}