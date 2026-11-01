class Solution {
    public boolean hasDuplicate(int[] nums) {
        var values = new HashSet<Integer>();
        for(int n : nums) {
            if(!values.add(n)) {
                return true;
            }
        }
        return false;
    }
}