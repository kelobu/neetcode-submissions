class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var groups = new HashMap<Integer, Integer>();
        for(int num : nums) {
            groups.putIfAbsent(num, 0);
            groups.computeIfPresent(num, (key,value) -> value + 1);
        }
        return groups.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
