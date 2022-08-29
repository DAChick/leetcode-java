import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap();
        for (int i = 0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int[] {i,(int)map.get(target-nums[i])};
            } else {
                map.put(nums[i],i);
            }
            
        }
        return null;
    }
}
