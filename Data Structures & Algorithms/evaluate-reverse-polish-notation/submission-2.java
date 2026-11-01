class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operators = Set.of("-", "+", "*", "/");
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {
            if(!operators.contains(token)) {
                stack.push(Integer.valueOf(token));
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch(token) {
                    case "+" -> stack.push(b + a);
                    case "-" -> stack.push(b - a);
                    case "/" -> stack.push(b / a);
                    case "*" -> stack.push(b * a);
                }
            }
        }

        return stack.peek();
    }
}
