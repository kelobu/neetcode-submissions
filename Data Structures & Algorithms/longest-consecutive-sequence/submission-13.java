class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numSet = new HashSet<Integer>();
        for(int n : nums) numSet.add(n);
        for(int n : nums) {
            if(numSet.contains(n - 1)) continue;
            int length = 0;
            while(numSet.contains(n + length)) {
                length++;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
