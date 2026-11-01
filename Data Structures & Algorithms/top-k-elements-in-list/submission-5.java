class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        var count = new HashMap<Integer, Integer>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for(int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<Integer>();
        }

        for(var entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        var res = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i > 0 && index < k; i--) {
            for(int n : freq[i]) {
                res[index++] = n;
                if(index == k) {
                    return res;
                }
            }
        }
        return res;
    }
        
}
