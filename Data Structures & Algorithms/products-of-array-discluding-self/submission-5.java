class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int value = 1;
        for(int n : nums) {
            if(n == 0) {
                zeros++;
            } else {
                value *= n;
            }
        }

        if(zeros > 1) {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num == 0) {
                res[i] = value;
            } else {
                res[i] = zeros > 0 ? 0 : value / num;
            }
        }
        return res;
    }
}  
