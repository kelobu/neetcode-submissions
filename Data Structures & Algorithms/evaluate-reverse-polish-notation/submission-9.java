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
            int result = 0;
            if("-+/*".contains(head.value)) {
                int a = Integer.parseInt(head.prev.prev.value);
                int b = Integer.parseInt(head.prev.value);
                if("-".equals(head.value)) result = a - b;
                else if("+".equals(head.value)) result = a + b;
                else if("/".equals(head.value)) result = a / b;
                else result = a * b;

                curr = head;

                head = head.prev.prev;
                head.next = curr.next;
                if(head.next != null) head.next.prev = head;
                head.value = String.valueOf(result);
                answer = result;

                curr.next = null;
                curr.prev = null;
            }
            
            head = head.next;            
        }
        return answer;
    }
}
