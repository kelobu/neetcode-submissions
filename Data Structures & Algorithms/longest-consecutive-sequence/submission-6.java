class Solution {
    public int longestConsecutive(int[] nums) {
        var values = new HashSet<Integer>();
        for(int n : nums) {
            values.add(n);
        }        

        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            int length = 0;
            if(!values.contains(nums[i] - 1)) {
                int curr = nums[i];
                while(values.contains(curr)) {
                    length++;
                    curr++;
                }
                res = Math.max(res, length);
            }
        }
        return res;
    }
}
