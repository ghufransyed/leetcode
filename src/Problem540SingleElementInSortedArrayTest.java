import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ghufran on 3/15/17.
 */
class Problem540SingleElementInSortedArrayTest {
   
    @Test
    void test1(){
        int[] input = new int[] {1,1,2,3,3,4,4,8,8};
        assertEquals(2, Problem540SingleElementInSortedArray.findSingleElement(input));
        
    }

    @Test
    void test2(){
        int[] input = new int[] {3,3,7,7,10,11,11};
        assertEquals(10, Problem540SingleElementInSortedArray.findSingleElement(input));
    }
    
    @Test
    void test3(){
        int[] input = new int[] {1,1,2};
        assertEquals(2, Problem540SingleElementInSortedArray.findSingleElement(input));
    }
    
    

}