
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 1) return List.of(List.of(strs[0]));
        var used = new boolean[strs.length];
        var anagramsGroup = new ArrayList<List<String>>();
        for(int i = 0; i < strs.length; i++) {
            if (used[i]) continue;
            var anagrams = new ArrayList<String>();
            anagrams.add(strs[i]);

            for(int j = i + 1; j < strs.length; j++) {
                if(!used[j] && validAnagram(strs[i], strs[j])) {
                    anagrams.add(strs[j]);
                    used[j] = true;
                }
            }
            anagramsGroup.add(anagrams);
        }
        return anagramsGroup;
    }

    private static boolean validAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        boolean[] seen = new boolean[s.length()];
        for(int i = 0; i < s.length(); i++) {
            boolean found = false;
            for(int j = 0; j < s.length(); j++) {
                if(!seen[j] && s.charAt(i) == t.charAt(j)) {
                    seen[j] = true;
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }

}
