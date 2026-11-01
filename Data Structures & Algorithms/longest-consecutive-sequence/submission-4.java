class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        
        int longestStreak = 0;
        int streak = 0;
        int curr = nums[0];
        for(int n : nums) {
            if(n == curr) {
                streak++;
                curr++;
            } else if(n == curr - 1) {
                continue;
            } else {
                longestStreak = Math.max(longestStreak, streak);
                streak = 1;
                curr = n + 1;
            }
        }
        
        return Math.max(longestStreak, streak);
    }
}
