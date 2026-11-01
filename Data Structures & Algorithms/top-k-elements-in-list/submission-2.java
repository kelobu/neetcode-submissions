class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var groups = new HashMap<Integer, Integer>();
        for(int num : nums) {
            groups.put(num, groups.getOrDefault(num, 0) + 1);
        }
        return groups.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
