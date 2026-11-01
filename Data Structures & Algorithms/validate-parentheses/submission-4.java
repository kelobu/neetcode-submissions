class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> parths = Map.of(')', '(', ']', '[', '}', '{');
        var stack = new LinkedList<Character>();
        for(var ch : s.toCharArray()) { 
            if(!parths.containsKey(ch)) {
                stack.push(ch);
            } else {
                if(!stack.isEmpty() && stack.peek() == parths.get(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
