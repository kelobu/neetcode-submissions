class Solution {
    public boolean isValid(String s) {
        Map parths = Map.of(')', '(', ']', '[', '}', '{');
        var stack = new LinkedList<Character>();
        for(var ch : s.toCharArray()) { 
            if(!parths.containsKey(ch)) {
                stack.push(ch);
            } else {
                if(stack.poll() != parths.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
