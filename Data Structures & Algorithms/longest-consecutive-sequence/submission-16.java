class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> store = new HashMap<Integer, Integer>();
        int result = 0;
        for(int n : nums) {
            if(store.containsKey(n)) continue;
            store.put(n, store.getOrDefault(n - 1, 0) + store.getOrDefault(n + 1, 0) + 1);
            store.put(n - store.getOrDefault(n - 1, 0), store.get(n));
            store.put(n + store.getOrDefault(n + 1, 0), store.get(n));
            result = Math.max(result, store.get(n));
        }
        return result;
    }
}
