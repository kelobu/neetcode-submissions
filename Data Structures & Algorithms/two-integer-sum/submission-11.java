// HashMap time: O(n) | space: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var seen = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(seen.containsKey(target - nums[i])) {
                return new int[]{seen.get(target - nums[i]), i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("no solution");
    }
}
