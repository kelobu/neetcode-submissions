class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int result = 0, streak = 0, curr = nums[0], i = 0;
        while(i < nums.length) {
            if(curr != nums[i]) {
                streak = 0;
                curr = nums[i];
            }
            while(i < nums.length && curr == nums[i]) i++;
            streak++;
            curr++;
            result = Math.max(result, streak);
        }
        return result;
    }
}
