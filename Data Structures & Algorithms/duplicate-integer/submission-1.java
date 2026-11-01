// Brute force
class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for(int i : nums) {
            int count = 0;
            for(int j : nums) {
                if(i == j) {
                    count++;
                }
                if(count > 1) {
                    return true;
                }
            }
        }
        return false;
    }
}