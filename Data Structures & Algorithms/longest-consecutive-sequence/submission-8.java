class Solution {
    public int longestConsecutive(int[] nums) {
        var mp = new HashMap<Integer, Integer>();

        int res = 0;
        for(int n : nums) {
            int left = mp.getOrDefault(n - 1, 0);
            int right = mp.getOrDefault(n + 1, 0);
            int length = left + right + 1;

            while(!mp.containsKey(n)) {
                mp.put(n, length);
                mp.put(n - left, length);
                mp.put(n + right, length);
                res = Math.max(res, length);
            }
        }
        return res;
    }
}
