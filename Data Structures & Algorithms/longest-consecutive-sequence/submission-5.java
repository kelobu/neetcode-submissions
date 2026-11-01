class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int longestStreak = 0, streak = 0, curr = nums[0], i = 0;

        while(i < nums.length) {
            if(nums[i] != curr) {
                streak = 0;
                curr = nums[i];
            }
            while(i < nums.length && nums[i] == curr) {
                i++;
            }
            curr++;
            streak++;
            longestStreak = Math.max(streak, longestStreak);
        }
        return longestStreak;
    }
}
