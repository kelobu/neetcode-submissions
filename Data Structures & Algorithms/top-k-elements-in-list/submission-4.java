class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        var count = new HashMap<Integer, Integer>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        var minHeap = new PriorityQueue<int[]>((a,b) -> a[1] - b[1]);
        for(var entry : count.entrySet()) {
            minHeap.offer(new int[]{entry.getKey(), entry.getValue()});
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[0];
        }
        return res;
    }
        
}
