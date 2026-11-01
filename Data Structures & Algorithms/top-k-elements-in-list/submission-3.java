class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var groups = new HashMap<Integer, Integer>();
        for(int num : nums) {
            groups.put(num, groups.getOrDefault(num, 0) + 1);
        }

        List<int[]> pairs = new ArrayList<>();
        for(var entry : groups.entrySet()) {
            pairs.add(new int[]{entry.getValue(), entry.getKey()});
        }
        pairs.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = pairs.get(i)[1];
        }
        return res;
    }
        
}
