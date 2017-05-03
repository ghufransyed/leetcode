/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */

public class Problem004MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1= 0;
        int r1= nums1.length - 1;
        int l2= 0;
        int r2= nums2.length - 1;
        int m1;
        int m2;
        int len = nums1.length + nums2.length;
        int lm1;
        int lm2;
        int rm1;
        int rm2;
        
        if (len % 2 == 0) {
            lm1 = nums1.length / 2;
            lm2 = lm1 + 1;
        } else {
            lm1 = nums1.length / 2;
            lm2 = lm1;
        }
        int m = len/2;
        
        if (nums1[r1] < nums2[l2]){
            if ()
        }
        

        if ()
        
        return -1.0;
    }
}
// possible approaches
// merge the two arrays, O(m+n), then binary search, O(log(m+n)) = O(m+n) i.e. too slow
// somehow use the fact that the arrays are sorted to 'discard' half the elements at each stage
// this is the only way the solution can be O(log(m+n))
// try comparing medians, if m1 < m2, then median is in right half of a1, or left half of a2
// repeat, until arrays of size 2
