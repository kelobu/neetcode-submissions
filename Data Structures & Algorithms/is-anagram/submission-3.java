class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        StringBuilder rest = new StringBuilder(t);

        for(char c : s.toCharArray()) {
            int idx = rest.indexOf(String.valueOf(c));
            if(idx == -1) return false;
            rest.deleteCharAt(idx);
        }

        return true;
    }
}
