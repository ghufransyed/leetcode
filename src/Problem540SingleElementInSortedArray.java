/**
 * Created by ghufran on 3/15/17.
 */
public class Problem540SingleElementInSortedArray {
    
    
    public static int findSingleElement(int[] input){
        // input should be a sorted array of integers
        // each element appears twice, except for one element
        // that appears once
        
        // find the single element that appears once
        
        // all arrays will be odd length
        // may be even-length subarray + center-element + even-length subarray
        // may be odd-subarray subarray + center-element + odd-length subarray
        
        
        // (2p+1) + 1 + (2p + 1) = 4p + 3
        // (2q) + 1 + (2q) = 4q + 1
        
        int len = input.length;
        int centre = (len / 2);
        int first = 0;
        int last = len - 1;
        
        while (first < last){
            
            len = (last - first + 1);
            if ((len % 4) == 1){
                // 2 even-length subarrays + center element
                if (input[centre - 1] == input[centre]){
                    last = centre;
                    centre = ((last + first) / 2);
                }
                else if (input[centre + 1] == input[centre]){
                    first = centre;
                    centre = ((last + first) / 2);
                }
                else {
                    return input[centre];
                }
                
            }
            else if ((len % 4) == 3){
                // 2 odd-length subarrays + center element
                if (input[centre - 1] == input[centre]){
                    first = centre + 1;
                    centre = ((last + first) / 2);
                }
                else if (input[centre + 1] == input[centre]){
                    last = centre - 1;
                    centre = ((last + first) / 2);
                }
                else {
                    return input[centre];
                }
            }
        }
        return input[centre];
        
    }
}
