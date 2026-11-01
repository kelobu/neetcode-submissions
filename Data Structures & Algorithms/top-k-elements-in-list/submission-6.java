class Solution {
    public int[] topKFrequent(int[] nums, int k) { 
        var frequencies = new HashMap<Integer, Integer>();

        for(var n : nums) { 
            frequencies.merge(n, 1, (a, b) -> a + b);
        }

        return frequencies.entrySet()
            .stream()   
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();



    
    }
}
