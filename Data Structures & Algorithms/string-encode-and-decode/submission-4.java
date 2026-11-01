class Solution {

    public String encode(List<String> strs) {
        var result = new StringBuilder();
        for(var s : strs) {
            result.append(s.length()).append("#").append(s);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        var result = new ArrayList<String>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            result.add(str.substring(i, j));
            i = j;
        }
        return result;
    }
}
