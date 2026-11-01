// HashSet time: O(n) | space: O(n)
class Solution {
    public boolean hasDuplicate(int[] nums) {
        var seen = new HashSet<Integer>();
        for(int n : nums) {
            if(!seen.add(n)) {
                return true;
            } 
        }
        return false;
    }
}