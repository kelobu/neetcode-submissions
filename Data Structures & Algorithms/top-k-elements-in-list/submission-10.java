class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var count = new HashMap<Integer, Integer>();
        for(int n : nums) {
           count.put(n, count.getOrDefault(n, 0) + 1);
        }
        
        var heap = new PriorityQueue<Integer[]>((a, b) -> a[0] - b[0]);
        for(var entry : count.entrySet()) {
            heap.offer(new Integer[]{entry.getValue(), entry.getKey()});
            if(heap.size() > k) {
                heap.poll();
            }
        }

        var res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = heap.poll()[1];
        }
        return res;
    }
}
