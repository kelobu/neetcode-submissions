class Solution {
    public int evalRPN(String[] tokens) {
        var stack = new Stack<Integer>();
        for(var t : tokens) {
            if("+".equals(t)) stack.push(stack.pop() + stack.pop());
            else if("-".equals(t)) {
                var a = stack.pop();
                var b = stack.pop();
                stack.push(b - a);
            }
            else if("*".equals(t)) stack.push(stack.pop() * stack.pop());
            else if("/".equals(t)) {
                var a = stack.pop();
                var b = stack.pop();
                stack.push(b / a);
            }
            else stack.push(Integer.parseInt(t));
        }
        return stack.pop();
    }
}
