class Solution {
    // public List<List<String>> groupAnagrams(String[] strs) {
    //     var sorted = new HashMap<String, List<String>>();
    //     for(String s : strs) {
    //         char[] chars = s.toCharArray();
    //         Arrays.sort(chars);
    //         String key = new String(chars);
    //         if(sorted.containsKey(key)) {
    //             sorted.get(key).add(s);
    //         } else {
    //             sorted.put(key, new ArrayList<String>(List.of(s)));
    //         }
    //     }
    //     return new ArrayList<List<String>>(sorted.values());
    // }

    public List<List<String>> groupAnagrams(String[] strs) {
        var sorted = new HashMap<String, List<String>>();
        for(String str : strs) {
            int[] seq = new int[26];
            for(char ch : str.toCharArray()) {
                seq[ch - 'a']++;
            }
            String key = Arrays.toString(seq);
            sorted.putIfAbsent(key, new ArrayList<>());
            sorted.get(key).add(str);
        }
        return new ArrayList<>(sorted.values());
    }
    
}
