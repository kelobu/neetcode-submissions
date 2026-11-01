class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length - 1; i++) {
            int iNum = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                int jNum = nums[j];
                if(iNum + jNum == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}
