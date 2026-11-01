// HashMap time: O(n) | space: O(nm)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var groups = new HashMap<String, List<String>>();
        for(var s : strs) {
            var count = new int[26];
            for(var c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            groups.putIfAbsent(key, new ArrayList<>());
            groups.get(key).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}