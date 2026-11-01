// Sorting HashMap time: O(nlogn) | space: O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var res = new HashMap<String, List<String>>();
        for(var s : strs) {
            var chars = s.toCharArray();
            Arrays.sort(chars);
            var sorted = String.valueOf(chars);
            res.putIfAbsent(sorted, new ArrayList<String>());
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
