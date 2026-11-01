class MinStack {

    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
        min = 0L;
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(0L);
            min = val;
        } else {
            stack.push(val - min);
            min = Math.min(val, min);          
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        long popped = stack.pop();
        if(popped < 0) min = min - popped;
    } 
    
    public int top() {
        if(stack.peek() > 0) {
            return (int) (stack.peek() + min);
        } else {
            return (int) min;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}
