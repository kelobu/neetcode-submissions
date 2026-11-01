// Sorting time: O(nlogn) | space: O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer[] indices = new Integer[nums.length];
        for(int i = 0; i < nums.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        int i = 0, j = indices.length - 1;
        while(i < j) {
            int sum = nums[indices[i]] + nums[indices[j]];
            if(sum > target) {
                j--;
            } else if(sum < target) {
                i++;
            } else {
                return new int[]{ Math.min(indices[i], indices[j]), Math.max(indices[i], indices[j])};
            }
        }
        throw new IllegalArgumentException("no solution");
    }
}
