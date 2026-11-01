// Sorting time: O(n^2k) | space: O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var copy = new String[strs.length];
        for(int i = 0; i < strs.length; i++) {
            var chArray = strs[i].toCharArray();
            Arrays.sort(chArray);
            var sorted = String.valueOf(chArray);
            copy[i] = sorted;
        }

        var groups = new ArrayList<List<String>>();
        var used = new boolean[strs.length];
        for(int i = 0; i < strs.length; i++) {
            if(used[i]) continue;
            var group = new ArrayList<String>();
            group.add(strs[i]);
            for(int j = i + 1; j < strs.length; j++) {
                if(!used[j] && copy[i].equals(copy[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            groups.add(group);
        }
        return groups;
    }
}

