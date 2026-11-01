// HashMap time: O(n) | space: O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        var letters = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()) {
            letters.computeIfAbsent(c, k -> 0);
            letters.computeIfPresent(c, (k, v) -> v + 1);
        }
        for(char c : t.toCharArray()) {
            if(!letters.containsKey(c)) {
                return false;
            }
            if(letters.get(c) == 0) {
                return false;
            }
            letters.computeIfPresent(c, (k, v) -> v - 1);
        }
        return true;
    }
}
