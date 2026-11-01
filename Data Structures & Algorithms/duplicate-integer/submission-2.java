class Solution {
    public boolean hasDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for(int n : nums) {
            if(!set.contains(n)) {
                set.add(n);
            } else {
                return true;
            }
        }
        return false;
    }
}