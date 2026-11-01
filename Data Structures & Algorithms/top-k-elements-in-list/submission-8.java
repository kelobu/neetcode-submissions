class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var count = new HashMap<Integer, Integer>(); 

        for(int n : nums) { 
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        List<Integer[]> arr = new ArrayList<Integer[]>();
        for(var entry : count.entrySet()){
            arr.add(new Integer[]{entry.getKey(), entry.getValue()});
        }

        arr.sort((a, b) -> Integer.compare(b[1], a[1]));
        
        int[] res = new int[k];
        for(int i = 0; i < k; i++) { 
            res[i] = arr.get(i)[0];  
        }
        return res;
    }
}
