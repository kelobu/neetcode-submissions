class MinStack {
    
    private List<Integer> stack;
    private PriorityQueue<Integer> minHeap;

    public MinStack() {
        this.stack = new ArrayList<>();
        this.minHeap = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.add(val);
        minHeap.offer(val);
    }
    
    public void pop() {
        if(stack.isEmpty()) throw new IllegalArgumentException();

        var removed = stack.remove(stack.size() - 1);
        minHeap.remove(removed);
    }
    
    public int top() {
        if(stack.isEmpty()) throw new IllegalArgumentException();

        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minHeap.peek();
    }
}
