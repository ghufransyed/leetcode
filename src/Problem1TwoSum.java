import java.util.HashMap;

/**
 * Created by ghufran on 3/15/17.
 */
public class Problem1TwoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap dataStore = new HashMap();
        int diff = 0;
        int index1 = 0;
        int index2 = 0;
        
        for (int i = 0 ; i < nums.length ; i++){
            diff = target - nums[i];
            if (dataStore.containsKey(diff)){
                index1 = (int) dataStore.get(diff);
                index2 = i;
                return new int[] {index1, index2};
            }
            else {
                dataStore.put(nums[i], i);
            }
        }
        return new int[] {-1,-1};
        
    }

}
