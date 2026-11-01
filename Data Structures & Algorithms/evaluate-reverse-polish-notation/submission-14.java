class Solution {
    public int evalRPN(String[] tokens) {
        List<String> values = new ArrayList<>(Arrays.asList(tokens));
        return dfs(values);        
    }

    private static int dfs(List<String> values) { 
        String value = values.remove(values.size() - 1);
        if(!"-+*/".contains(value)) return Integer.parseInt(value);

        int right = dfs(values);
        int left = dfs(values); 
        switch(value) {
            case "-": return left - right;
            case "+": return left + right;
            case "*": return left * right;
            case "/": return left / right;
        } 

        return 0;
    }
}
