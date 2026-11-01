class Solution {
    static class DLList {
        String value;
        DLList next;
        DLList prev;

        DLList(String value, DLList next, DLList prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    
    public int evalRPN(String[] tokens) {
        DLList curr = new DLList(tokens[0], null, null);
        DLList head = curr;
        for(int i = 1; i < tokens.length; i++) {
            curr.next = new DLList(tokens[i], null, curr);
            curr = curr.next;
        }

        int answer = Integer.parseInt(tokens[0]);
        while(head != null) {
            if("-+/*".contains(head.value)) {
                int result = 0;
                int a = Integer.parseInt(head.prev.prev.value);
                int b = Integer.parseInt(head.prev.value);
                if("-".equals(head.value)) result = a - b;
                else if("+".equals(head.value)) result = a + b;
                else if("/".equals(head.value)) result = a / b;
                else result = a * b;
 
                head.value = String.valueOf(result);
                head.prev = head.prev.prev.prev;
                if(head.prev != null) head.prev.next = head;
            }
            answer = Integer.parseInt(head.value);
            head = head.next;            
        }
        return answer;
    }
}
